# dates_times_timedeltas_and_timezones

In python we have, dates, times, datetimes, timezones, timedetlas and it is not very obvious when to use what.

## datetime

the main module for working with dates in python is the date time module.

### Naive datetimes  

don't have enough information to determine things like timezones or daylight saving times but they are easier to work with if you don't need that level of detail.

- `datetime.date`

    - create a date

        ```python
        import datetime
        
        date = datetime.date(2020, 7, 24)
        print(date)
        ```

        > **Note**: creating and storing dates is not as representing them (i.e: in representatoin you can add a leading zero).

    - today's date

        ```python
        date = datetime.date.today()
        ```

    - graping parts of the date

        ```python
        print(date.year)
        print(date.month)
        print(date.day)
        ```

    - getting the weekday

        ```python
        print(date.weekday()) # MON: 0, SUN: 6
        print(date.isoweekday()) # MON: 1, SUN: 7
        ```
- `datetime.time`

    - create a time

        ```python
        time = datetime.time(9, 30, 23, 10000) # hours, minutes, seconds, microseconds
        print(time) # output: 09:30:23.010000
        ```

        > **Note**: `ValueError: microsecond must be in 0..999999`

    - grabing parts of the time

        ```python
        print(time.hour) # output: 9
        print(time.minute) # output: 30
        print(time.second) # output: 23
        ```

- `datetime.datetime`

    sometimes when needing the time, we need the date too.With `datetime.datetime` you can pass: year, month, day, hour, minute, second, micorsecond.
    
    - create a datetime

        ```python
        dt = datetime.datetime(2020, 9, 23, 13, 23, 34, 1000)
        print(dt) # output: 2020-09-23 13:23:34.001000
        ```

    - graping what we want freely

        ```python
        print(dt.date())
        print(dt.time())
        print(dt.year) # as we did with the date
        print(dt.hour) # as we did with the time
        ```
    
    - 3 different ways to represent today

        ```python
        today = datetime.datetime.today() # output: 2020-08-19 18:53:36.353728
        now = datetime.datetime.now() # output: 2020-08-19 18:53:36.353728
        utcnow = datetime.datetime.utcnow() # output: 2020-08-19 18:53:36.353728
        ```
    
        - today: returns the current local datetime with a timezone of None.
        - now: gives us the option to pass in a timezone.
        - utcnow: gives the current `utc` time but the `tzinfo` is still set to `None`.

        > **Note**: if you leave the time zone empty, then all of those are similar.

        > **Note**: utc is not a timezone aware datetime. 

        > **Note**: nothing in the `datetime` library gonna give you tzone aware objects(datetimes), you have to explicitly set them.

    - make a naïve datetime timezone aware

        ```python
        now = datetime.datetime.now() # not time zone aware because we didn't pass the timezone info
        dt_cairo = now.astimezone(pytz.timezone('Africa/Cairo')) # output: ValueError: astimezone() cannot be applied to naive datetime
        ```
        ```python
        # to make a naïve datetime tzone aware, you gotta run the localize()
        cairo_tz = pytz.timezone('Africa/Cairo')
        dt_cairo = cairo_tz.localize(dt_cairo)

        # after we made the datetime timezone aware, now we can change the timezone
        dt_mountain = dt_cairo.astimezone(pytz.timezone('US/Mountain'))
        ```

### Aware datetimes  
they have enough information to determine teimezones and keep track of daylight saving times.

- `pytz`

    is a third party package.Can be installed using pip.

    > **Note**: you can work with timezones using the standard library but even in python docs, they recommend using `pytz`.Especially that `pytz` is easier to use.

    > **Tip**: in the docs of `pytz` it is recommended to always work with _utc_ when dealing with timezones.

    - creating a timezone aware datetime using utc

        ```python
        import pytz
        dtime = datetime.datetime(2020, 12, 2, 12, 12, 12, tzinfo=pytz.UTC) # the microseconds are left to default
        print(dtime)
        ```

        ```python
        dt_now = datetime.datetime.now(tz=pytz.UTC) # easier, less typing, easier to read (RECOMM|ENDED)
        dt_utcnow = datetime.datetime.utcnow().replace(tzinfo=pytz.UTC)

        dt_cairo = dt_utcnow.astimezone(pytz.timezone('Africa/Cairo'))
        # we took a tzone aware datetime set to utc and converted that to cairo time.
        ```

        > **Note**: `pytz` has a huge list of timezones to choose from. You can print them all out using a `for` loop.

        ```python
        for tz in pytz.all_timezones:
            print(tz)
        ```

## time deltas

are the difference between 2 dates or times. They are useful for doing operations on dates and times.

- time delta that is a 7 days away

    ```python
    tday = datetime.date.today()
    tdelta = datetime.timedelta(days=7)

    print(tday + tdelta) # output: what the date will be 7 days from now
    ```

    > **Note**: `date +/- date = timedelta`. This equation is very important.

    ```python
    # date2 = date1 + timedelta
    # timedelta = date2 - date1
    ```

    ```python
    my_birth_date = datetime.date(1998, 2, 27)
    today = datetime.date.today()
    
    print(today - my_birth_date) # output: 8209 days, 0:00:00
    ```

    ```python
    next_birthdate = datetime.date(2021, 2, 27)
    till_bday = next_birthdate - today
    print(till_bday) # 192 days, 0:00:00
    print(till_bday.days) # 192
    print(till_bday.seconds) # 0
    print(till_bday.total_seconds()) # 16588800.0
    ```

- timedelat with other objects (time, datetime)

    ```python
    td = datetime.timedelta(hours=8)
    print(td + datetime.timedate.today())
    ```

## format datetime

- `isoformat()`
    
    an international standard to format datetime.

    ```python
    print(dt_cairo.isoformat()) 
    ```
- `strftime()`

    used to convert a datetime into a string.

    this method needs format codes in (list of formats) section

    f: for format
    
    ```python
    print(dt_cairo.strftime('%B %d, %Y'))
    ```
    
    > **Note**: don't remember the formats, just see the documentation to find the format that you want.

- `strptime()`

    usded to convert a string into a datetime object.

    p: for parse

    ```python
    dt_str = 'July 26, 2020'
    dt = datetime.datetime.strptime(dt_str, '%B %d, %Y')
    ```

- list of formats

        # see the documentation



> **Note**: There is a popular python package called Arrow that is used to deal with dates and times in an easier way.

# Refrences

[0]corey schafer - https://www.youtube.com/watch?v=eirjjyP2qcQ&list=PL-osiE80TeTskrapNbzXhwoFUiLCjGgY7&index=17