# Paper 2 nov 2018 SL

## 10 a.

i. 

    An object is an abstract entity represnting the real world. It has data and/or actions such as attributes and behaviours.

ii. 

    1. OOP requires an entire file for one object entity, consequently taking up far more secondary storage data.
    2. OOP has a far more rigid structure in comparison to python, therefore requiring more effort to to construct in achieving abstraction.

iii. 

    Modularity is advantageous when considering the its re-usability. Since modules can be stored within libraries and resed for different programs.

## 10 b.

    The Arrival object has/stores a Flight object. We cannot create an Arrival instance without the Flight object.

## 10 c.
```
|           Arrival            |
--------------------------------
| - Flight myflight;           |
| - String sta;                |
| - int runway;                |
| - String gate;               |
| - int delay;                 |
| - boolean landed;            |
--------------------------------
| + void addDelay(int)         |
| + String getETA()            |
| + int compareWith(String)    |
| + int compareWith(Arrival)   |
```

## 10 d.
```
private static int search(String flightID) {
        int i = 0;
        while (inbound[i].compareWith(flightID) != 0) {
            i++;
        }
        return i;
    }
```

## 10 e.
i.

    It may be faster as a search because it is limits its search by half each iteration

ii.

    If the array is not sorted, the binary search will not funciton because the data must be sorted first which adds to the effort and computational costs.

# HL Extension
