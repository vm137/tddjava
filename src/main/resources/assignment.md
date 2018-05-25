###TDD Задание:

1. Напишите параметризованный тест (факториал, деление, умножение). 
Тест должен содержать один метод тестирующий исключение и один игнорируемый метод.

2. Напишите как можно больше тестов для класса Range. 

Класс Range имеет следующий интерфейс:
```boolean isBefore(Range otherRange);
boolean isAfter(Range otherRange);
boolean isConcurrent(Range otherRange);
long getLowerBound();
long getUpperBound();
boolean contains(long value);
List<Long> asList();
Iterator<Long> asIterator();
```
