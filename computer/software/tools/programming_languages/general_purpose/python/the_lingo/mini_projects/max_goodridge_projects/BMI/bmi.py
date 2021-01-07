# what is BMR (Base Metapolic Rate)?
# it is the amount of calories your body burns if you are not doing anything physical including moving, blinking...etc.
# link: https://www.youtube.com/watch?v=EU4nwXQC7ac&list=PLw02n0FEB3E2RDlD2cBULQjvXJ1K_jS1O&index=7&t=0s

class BMR:
    
    def __init__(self, weight, height, age):
        self.weight = weight
        self.height = height
        self.age = age

    def getbmr(self):
        return 66.5 + (13.75 * self.weight) + (5 * self.height) - (6.755 * self.age)


my_bmr = BMR(85, 175, 23)        

print("claories burnt: ", round(my_bmr.getbmr()) / 1000, ' kcal')