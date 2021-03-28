<img src="https://camo.githubusercontent.com/cafe7727437e205ada2980096f042c15351a980d189c544a485b07ea6b94cdda/68747470733a2f2f73756e392d31332e757365726170692e636f6d2f494252447973762d4c522d6d5f32467969684938366b584c48794132766276796f70595a30412f50316a4e477a44717a72632e6a7067" alt="DeelTer Face" align="right">
<div align="center">
  <h1>DateEvents</h1>
  <h3>time-bound commands</h3>

  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-download-green)](https://github.com/DeelTer/DateEvents/releases)
</div>

<div align="center">
  <div align="left"><h2>Commands</h2></div>
    <div align="left">
      <p>● /accountchanger reload - Reload config<br>● /accountchanger [UUID1] [UUID2] - Transfer command<br></p>
    </div>
</div>

###DateEvents
##time-bound commands
  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-download-green)](https://github.com/DeelTer/DateEvents/releases)


##Configuration
```
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
