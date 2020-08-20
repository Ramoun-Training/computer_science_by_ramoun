class Car:

    color = 'red'

    def drive(self):
        # self allows objects to use that method or it will be used by the class only like the next method
        pass
    
    def stop():
        print('stopping')


bmw = Car()

print(bmw.color)

bmw.color = 'blue'

print(bmw.color)

mercedez = Car()

print(mercedez.color)

print(Car.color)

Car.stop()

print(bmw.stop)

print(bmw.stop())
