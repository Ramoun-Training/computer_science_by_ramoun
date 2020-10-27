# Using old code with new versions of PHP

Two of the most important recent changes that affect old code are:

- The old $HTTP_*_VARS arrays are not available as of PHP 5.4.0. The following superglobal arrays were introduced in PHP » 4.1.0. They are: $_GET, $_POST, $_COOKIE, $_SERVER, $_FILES, $_ENV, $_REQUEST, and $_SESSION.
External variables are no longer registered in the global scope by default. In other words, as of PHP » 4.2.0 the PHP directive register_globals is off by default in php.ini. 

- The preferred method of accessing these values is via the superglobal arrays mentioned above. Older scripts, books, and tutorials may rely on this directive being on. If it were on, for example, one could use $id from the URL http://www.example.com/foo.php?id=42. Whether on or off, $_GET['id'] is available.
For more details on these changes, see the section on [predefined](https://www.php.net/manual/en/language.variables.predefined.php) variables and links therein.