in_day=input('Enter day[1:31]: ')
in_month=eval(input('Enter months[1:12]: '))
in_year=input('Enter year: ')

months=['jan','feb','mar','apr','may','jun','jul','aug','sep','oct','nov','dec']

if in_day=='1'or'21'or'31':
    day=in_day+'st'
elif in_day=='2'or'22'or'32':
    day=in_day+'nd'
elif in_day=='3'or'23'or'33':
    day=in_day+'rd'
else:
    day=in_day+'th'

month=months[in_month-1]
year=in_year

form=day+' of '+str(months)+', '+year
print(form)







