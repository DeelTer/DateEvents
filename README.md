
<img src="https://sun9-42.userapi.com/impg/7dOtxy90stjNjrhfLkrzwmVo7nrLEcn6p2hy-g/zz7TbiIoHcc.jpg?size=1400x400&quality=96&sign=bd1ba4a110431ed1de14b689a9ec0913&type=album" alt="DateEvents" align="center">

<div align="center">
  <h3>Команды выполняются в определенное время</h3>
  
  [![Vk](https://img.shields.io/badge/vk-DeelTer-9cf)](https://vk.com/DeelTer/)
  [![Build](https://img.shields.io/badge/builds-check%20it-green)](https://github.com/DeelTer/DateEvents/releases)
  
</div>

### Configuration:
```Yaml
#Время проверки в секундах
check-time: 25

events:
  custom-event: #Название ивента (ни на что не влияет)
    zone: "Europe/Moscow" #Часовой пояс
    day: #Дни, в которые ивент будет запущен (если лист пустой = каждый день)
      - "MONDAY"
      - "TUESDAY"
    time: #Время запуска ивента
      - "05:04"
      - "04:30"
      - "02:10"
    commands: #Команды, которые выполнит ивент
      - "say It works!"
      - "say Hello guys"

#Названия дней: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

debug: false
```
