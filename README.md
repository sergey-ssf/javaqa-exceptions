# Домашнее задание 13 к занятию 14 «Исключительные ситуации и их обработка. Тестирование исключений»

## Задание 1. NotFoundException (обязательное к выполнению)

Вы развиваете приложение с менеджером товаров, который мы рассматривали на лекции, и решили сделать так, чтобы при попытке удаления несуществующего объекта из репозитория генерировалось ваше исключение, а не ArrayIndexOfBoundsException.

Обратите внимание: это правильный подход, поскольку таким образом вы сообщаете через генерацию исключения, что это исключение, вписывающееся в вашу логику, а не ошибка программиста.

Что нужно сделать:

- Возьмите проект с менеджером, репозиторием и товарами, мы его писали в рамках ДЗ про наследование. КОД МЕНЕДЖЕРА ПРОДУКТА ПРОСТО СКОПИРОВАЛ В ДРУГУ ПАПКУ. 
- Создайте класс исключения NotFoundException, отнаследовавшись от RuntimeException, и реализуйте как минимум конструктор с параметром-сообщением. Он будет просто вызывать суперконструктор предка, см. подсказку.
- В методе удаления removeById сначала проверяйте, есть ли элемент. Для этого прямо из метода removeById вызывайте метод findById: если результат null, тогда выкидывайте исключение NotFoundException.
- Напишите два автотеста на репозиторий: первый должен проверять успешность удаления существующего элемента, второй — генерации NotFoundException при попытке удаления несуществующего элемента.