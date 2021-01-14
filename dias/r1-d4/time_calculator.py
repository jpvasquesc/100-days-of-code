def add_time(start, duration, weekday="a"):
  
  # formatting input into 24h system
  sTime = start.split()[0]
  sMeridiem = start.split()[1]
  sHour = int(sTime.split(":")[0])
  sMin = int(sTime.split(":")[1])

  if sMeridiem == "PM":
    sHour = sHour + 12

  dHour = int(duration.split(":")[0])
  dMin = int(duration.split(":")[1])

  ovrHour = 0
  ovrDays = 0

  # if the min pass 60 add 1 hour and reset the min to 0
  fMin = sMin + dMin
  if fMin >= 60:
    ovrHour = int(fMin/60)
    fMin = fMin - (60*ovrHour)

  # if the hour pass 24 add 1 day and reset the hour to 0
  fHour = sHour + dHour + ovrHour
  if fHour >= 24:
    ovrDays = int(fHour/24)
    fHour = fHour - (24*ovrDays)

  # revert time back to 12hour system
  if fHour >= 12:
    fMeridiem = " PM"
    fHour = fHour - 12
  else:
    fMeridiem = " AM"

  if fHour == 0:
      fHour = 12

  ##decide day of the week
  weekday = (weekday.lower()).capitalize()

  # list indexing days of the week to numbers
  week = {'Sunday': 0, 'Monday' : 1, 'Tuesday' : 2, 'Wednesday' : 3, 'Thursday' : 4, 'Friday' : 5, 'Saturday' : 6}
  
  # figure out which weekday it will be, as a number
  if weekday in week:
    nWeekday = (week[weekday] + ovrDays)

    while nWeekday > 6:
      nWeekday = nWeekday - 7

  # return the number to a weekday name
    for key, value in week.items():
     if value == nWeekday:
        fWeekday = key

  #change time to the correct return format
  if fMin < 10:
    rTime = ("%s:0%i%s" % (fHour, fMin, fMeridiem))
  else:
    rTime = ("%s:%i%s" % (fHour, fMin, fMeridiem)) 

  if weekday != "A":
    rTime = rTime + (", %s" % fWeekday) 

  if ovrDays > 0:
    if ovrDays == 1:
      rTime = rTime + " (next day)"
    else:
      rTime = rTime + (" (%i days later)" % ovrDays)
  
  return rTime


#print(add_time("11:59 PM", "24:05"))