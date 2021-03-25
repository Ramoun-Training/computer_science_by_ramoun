import datetime
userin=input('Project date (mm/dd/yyyy): ')
current=datetime.date.today()
proj=datetime.datetime.strptime(userin,'%m/%d/%Y')
sumy=proj-current
print(sumy)
