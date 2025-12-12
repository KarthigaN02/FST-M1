class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Toyota", "Hyrider", "2024", "Automatic", "Red")
car2 = Car("Benz", "GLE220", "2010", "Manual", "Black")
car3 = Car("Suzuki", "Baleno", "2015", "Automatic", "Royal blue")

car1.accelerate()
car1.stop()