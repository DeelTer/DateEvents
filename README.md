
<img src="https://sun9-42.userapi.com/impg/7dOtxy90stjNjrhfLkrzwmVo7nrLEcn6p2hy-g/zz7TbiIoHcc.jpg?size=1400x400&quality=96&sign=bd1ba4a110431ed1de14b689a9ec0913&type=album" alt="DateEvents" align="center">

<div align="center">
  <h3>Commands are executed at a specific time</h3>
  
  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-check%20it-green)](https://github.com/DeelTer/DateEvents/releases)
  
</div>

### Config.yml:
```Yaml
#Check time in seconds
check-time: 25

events:
  custom-event: #Event name
    zone: "Europe/Moscow" #Timezone
    day: #Days on which event will be launched (if list is empty = every day)
      - "MONDAY"
      - "TUESDAY"
    time: #Event launch time
      - "05:04"
      - "04:30"
      - "02:10"
    commands: #Commands that the event will execute
      - "say It works!"
      - "say Hello guys"

#Days: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

#Debug to console
debug: false
```
