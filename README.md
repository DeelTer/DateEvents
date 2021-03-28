
<img src="https://sun1-85.userapi.com/dTKEIVOQuzKF8XfiMt1tn5QZZIWhKKILRNkAQw/RQkUPRn_piA.jpg" alt="DonationAlerts" align="center">

<div align="center">
  <h3>time-bound commands</h3>
  
  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-check%20it-green)](https://github.com/DeelTer/DonationAlerts/releases)
  
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
