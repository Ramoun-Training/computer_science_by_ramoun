"""customer module"""


class User:
    """User class"""

    def log(self):
        """log function"""
        print(self)


class Teacher(User):
    """Teacher class"""

    # overriding the User.log() method
    def log(self):
        print("i am a teacher")


class Customer(User):
    """Customer class"""

    def __init__(self, name, membership):
        self._name = name
        self.membership = membership

    # when we try to access the name property, this is going to be invoked
    @property  # this is how we say this is a property and not a normal method + it won't be overridden by our main self.name attribute
    def name(self):
        """return name property"""
        print("getting name")
        return self._name  # private, don't touch this if you are not within the class

    # when we try to set the name property, this is going to be invoked
    @name.setter
    def name(self, name):
        print("setting name")  # this is where the extra functionality layer would go
        self._name = name

    # whenever we use the del keyword to delete the name property the deter function is invoked
    @name.deleter
    def name(self):
        del self._name

    def update_membership(self, new_membership):
        """call api to update membership"""
        # invoke API
        # calculate prices
        self.membership = new_membership

    # @classmethod
    # def print_all_customers(cls):
    #     for customer in cls.customers:
    #         print(customer)

    def __str__(self):
        return self.name + " " + self.membership

    def __eq__(self, other):
        if self.name == other.name and self.membership == other.membership:
            return True

        return False

    __repr__ = __str__

    __hash__ = None


users = [Customer("ramoun", "gold"), Customer("caleb", "silver"), Teacher()]

print(users)

# NOTE: none of the invokation code should be changed to use @property


print("*** " * 10)
# polymorphism
for user in users:
    user.log()
