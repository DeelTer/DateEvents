
<img src="https://sun9-42.userapi.com/impg/7dOtxy90stjNjrhfLkrzwmVo7nrLEcn6p2hy-g/zz7TbiIoHcc.jpg?size=1400x400&quality=96&sign=bd1ba4a110431ed1de14b689a9ec0913&type=album" alt="DateEvents" align="center">

<div align="center">
  <h3>commands that are executed at the right time</h3>
  
  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-check%20it-green)](https://github.com/DeelTer/DateEvents/releases)
  
</div>

### Configuration:
```Yaml
#In seconds
check-time: 25

events:
  event1: #Тестовый ивент
    zone: "Europe/Moscow" #Часовой пояс
    day: #Дни, в которые скрипт будет запущен
      - "MONDAY"
      - "TUESDAY"
    time: #Время, в которое скрипт будет запускаться
      - "05:04"
      - "04:30"
      - "02:10"
    commands: #Команды, которые выполнит скрипт
      - "say It works!"
      - "say Hello guys"
  event2:
    zone: "Europe/Moscow"
    day:
      - "THURSDAY"
      - "FRIDAY"
    time:
      - "14:00"
      - "15:00"
    commands:
      - "say It works! Again..."

#days:
#  1: "MONDAY"
#  2: "TUESDAY"
#  3: "WEDNESDAY"
#  4: "THURSDAY"
#  5: "FRIDAY"
#  6: "SATURDAY"
#  7: "SUNDAY"

debug: false
```
