# Voicebot recruitment task

W specyfikacji zadania nie było doprecyzowane, jaki jest sposób zapisu liczb dziesiętnych. Z pozostałych danych również nie wynikało jasno czy zapis ma być z kropką, czy z przecinkiem. Założyłem, że wyjątek należy obsłużyć, a decyzję o tym, co zrobić, zostawić użytkownikowi (przerwać dzianie programu / przekonwertować dane / zignorować błąd). Ponieważ Opencsv jest wielowątkowy a decyzję co zrobić, wydaje użytkownik, żeby zapewnić synchronizację, moduł pobierający dane od użytkownika musi być singletonem.

## Zależności:

- Opencsv
- Jackson
- JUnit
- Mockito
- system-rules for JUnit