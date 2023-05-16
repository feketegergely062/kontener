# A Konténer fejlesztői dokumentációja. 

2023-05-16
Copyright (c) 2023,Fekete Gergely

## Célok


A konténer kft fájlban tárolandó adatait beolvassa.

## Fejlesztő kornyezet

Átlagos irodai gépeken fejleszthető,projekt elkészültekor, modernebb feltételek áltak rendelkezésre.

* Operációs rendszer : Windows 10
* Java SE JDK - 17.x verzió
* Visual Studio Code verzió: 1.75.1

## Adatszerkezetek

### Fájlok

A programot MVC szerint tobb fájlba lett tárolva, külon konyvtár nélkül.

A program belépésí pontja az App.java MVC szerinti bontás:

* Kontroller: MainController.java
* Modellek: Employee.java, LoadFile.java
* Nézetek: InputPanel.java, MainFrame.java

### Változók és objektumok

A MainController osztályba toltődik az osszes dolgozó értéke egy ArrayList&lt; Employee&gt; listába. 

Induláskor a program betolti az első dolgozó adatait. 

Az aktuálisa betoltott dolgozó indexe, a MainController osztályba az **actual** változóban van. 

A listában tárolt dolgozók egy Employee modellben tárolhatók. Az Employee osztálynak háromféle konstruktora van.:

```java
Employee(
    Integer id;
    String name;
    String city;
    String address;
    LocalDate birth;
    Double salary;
)
```