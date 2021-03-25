Welcome to "How Machine Learning Works", a Pluralsight training by Paolo Perrotta! The code in this directory is the same that is shown in the training's videos, plus extra comments.

To run this code, you need Python 3 and a few packages. Check that you have Python 3 installed by running this command from a terminal:

    python --version

If you don't have Python, or if you have Python 2, then you should install a recent version of the language. There are a few ways to do that, but the most obvious is to download an installation package from https://www.python.org/downloads/.

Then you need to install Jupyter Notebooks, NumPy, and Matplotlib. Here are the commands to install them with pip, Python's package manager:

    pip install jupyter==1.0.0
    pip install numpy==1.15.2
    pip install matplotlib==3.0.3

The commands above install the specific versions of the packages that I used when I produced this training. If you already have these packages in a different version, you'll still be fine in most cases. If you stumble upon an incompatibility as you run the code, however, you might want to try these exact versions.

Once you're all set up, open a terminal window, navigate to the directory where you unzipped these notebooks, and start Jupyter with:

    jupyter notebook

Check out https://jupyter.org if you want detailed instructions on using Jupyter Notebook. Have fun experimenting with this code!

   Paolo
