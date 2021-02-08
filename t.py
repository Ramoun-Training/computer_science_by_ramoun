import os
import argparse
from pathlib import Path

class DisplayablePath(object):
    display_filename_prefix_middle = '├──'
    display_filename_prefix_last = '└──'
    display_parent_prefix_middle = '    '
    display_parent_prefix_last = '│   '

    def __init__(self, path, parent_path, is_last):
        self.path = Path(str(path))
        self.parent = parent_path
        self.is_last = is_last
        if self.parent:
            self.depth = self.parent.depth + 1
        else:
            self.depth = 0

    @property
    def displayname(self):
        if self.path.is_dir():
            return self.path.name + '/'
        return self.path.name

    @classmethod
    def make_tree(cls, root, parent=None, is_last=False, criteria=None):
        root = Path(str(root))
        criteria = criteria or cls._default_criteria

        displayable_root = cls(root, parent, is_last)
        yield displayable_root

        children = sorted(list(path
                               for path in root.iterdir()
                               if criteria(path)),
                          key=lambda s: str(s).lower())
        count = 1
        for path in children:
            is_last = count == len(children)
            if path.is_dir():
                yield from cls.make_tree(path,
                                         parent=displayable_root,
                                         is_last=is_last,
                                         criteria=criteria)
            else:
                yield cls(path, displayable_root, is_last)
            count += 1

    @classmethod
    def _default_criteria(cls, path):
        return True

    @property
    def displayname(self):
        if self.path.is_dir():
            return self.path.name + '/'
        return self.path.name

    def displayable(self):
        if self.parent is None:
            return self.displayname

        _filename_prefix = (self.display_filename_prefix_last
                            if self.is_last
                            else self.display_filename_prefix_middle)

        parts = ['{!s} {!s}'.format(_filename_prefix,
                                    self.displayname)]

        parent = self.parent
        while parent and parent.parent is not None:
            parts.append(self.display_parent_prefix_middle
                         if parent.is_last
                         else self.display_parent_prefix_last)
            parent = parent.parent

        return ''.join(reversed(parts))

# cwd = os.getcwd()
# dir_content = os.listdir()

# print(cwd)
# print(os.path.basename(cwd))

# for file in dir_content:
#	if os.path.isfile(file):
#		pass
#	else:
#

# for root, dirs, files in os.walk(cwd):
#	for _dir in dirs:
#		print(_dir)
#	for _file in files:
#		print(_file)

def search(dir, level):
	for f_d in os.listdir(dir):
		if os.path.isfile(f_d):
			print('-'*level, end="")
			print(f_d)
		else:
			if f_d.startswith('.'):
				pass
			else:
				print('-'*level, end="")
				print(f_d)
				level += 1
				search(os.path.abspath(f_d), level)

def list_files(startpath):
    for root, dirs, files in os.walk(startpath):
        level = root.replace(startpath, '').count(os.sep)
        indent = '-' * 4 * (level)
        print('{}{}/'.format(indent, os.path.basename(root)))
        subindent = ' ' * 4 * (level + 1)
        for f in files:
            print('{}{}'.format(subindent, f))				

# level = 0

# search(cwd, level)

# list_files(cwd)


if __name__ == "__main__":

	# what does this tool do?
	parser = argparse.ArgumentParser(
		description='List all files and folders inside a directory'
	)

	parser.add_argument(
		'--path',
		type=str,
		default='.',
		help='directory path of the to be listed as a tree directory'
	)

	args = parser.parse_args()
	path = args.path

	# cwd = os.getcwd()

	# paths = DisplayablePath.make_tree(Path('doc'))
	paths = DisplayablePath.make_tree(path)
	for path in paths:
		print(path.displayable())
