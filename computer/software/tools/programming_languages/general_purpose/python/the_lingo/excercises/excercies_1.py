"""
exercise
"""

# Given a List of integers, return True if the sequence of numbers 1, 2, 3
# appears in the list somewhere.
# For example:
# arrayCheck([1, 1, 2, 3, 1]) → True
# arrayCheck([1, 1, 2, 4, 1]) → False
# arrayCheck([1, 1, 2, 1, 2, 3]) → True


def array_check(array):
    """
    check for existence of [1,2,3]
    """
    frontier = []

    for i in array:
        if i == 1 and not frontier:
            frontier.append(i)
        elif i == 2 and frontier and frontier[-1] == 1:
            frontier.append(i)
        elif i == 3 and frontier and frontier[-1] == 2:
            frontier.append(i)
            return True

    return False


def array_check_2(array, seq):
    for idx in range(len(array) - 2):
        if array[idx: idx + 3] == seq:
            return True
    return False


def check_sequence_in_array(array, seq):
    """
    Check if the given sequence exists in the array.

    Args:
    - array: The input array to search.
    - seq: The sequence to check for in the array.

    Returns:
    - True if the seq is found, False otherwise.
    """
    array_len = len(array)
    seq_len = len(seq)
    if array_len < seq_len:
        return False

    for i in range(array_len - seq_len + 1):
        if array[i : i + seq_len] == seq:
            return True

    return False


def end_other(a: str, b: str) -> bool:
    """
    return if a ends in b or b ends in a
    """
    a = a.lower()
    b = b.lower()
    return (a.endswith(b) or b.endswith(a))


# Given 3 int values, a b c, return their sum. However, if any of the values is a
# teen -- in the range 13-19 inclusive -- then that value counts as 0, except 15
# and 16 do not count as a teens. Write a separate helper "def fix_teen(n) : "that
# takes in an int value and returns that value fixed for the teen rule.
# In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
# Define the helper below and at the same indent level as the main no_teen_sum().
# Again, you will have two functions for this problem!
#
# Examples:
#
# no_teen_sum (1, 2, 3) → 6
# no_teen_sum (2, 13, 1) → 3
# no_teen_sum (2, 1, 14) → 3


def fix_teen(num):
    """
    remove teen based on condition
    """
    if (13 <= num <= 19) and (num != 15 or num != 16):
        return 0

    return num


def no_teen_sum(*nums):
    """
    sum of no teens
    """
    them_sum = 0
    for num in nums:
        them_sum += fix_teen(num)

    return them_sum


# count number of even integers in a given array

arr = [2, 2, 2, 3, 4]
res = len(list(filter(lambda n: n % 2 == 0, arr)))
print(res)  # => 4
