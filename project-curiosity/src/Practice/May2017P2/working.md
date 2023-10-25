# Paper 2 nov 2017 SL

## 11 a.
```java
public SalesPerson(String id) {
    this.id = id;
    this.salesHistory = new Sales[100];
    this.count = 0;
}
```


## 11 b.
```
In Java, 'private', 'public' and 'protected' are accessor modifiers which developers use for *encapsulating* the data. When attributes are 'private' they cannot be accessed outside the class. To give "read access" the developer must provide accessor methods. E.g. 'public int getCount() and 'public String getID()'.
```

## 11 c i.
```
'SalesPerson' has many 'Sales'

|         SalesPerson            |          |         Sales         |         
----------------------------------          -------------------------
| - String id;                   |          | - String itemId;      |
| - Sales[] salesHistory;        | <>-------| - double value;       | 
| - int count;                   |          | - int quantity        |
----------------------------------          -------------------------
| + void setSalesHistory(Sales s)|          | + double getValue()   |
| + double calcTotalScales()     |          | + int getQuantity()   |
```

## 11 c ii.
```
Through the over dependency of the Sales object on SalesPerson, negative implications could emerge. For instance, through the change in names of the methods or class, this may cause extensive bugs and errors requiring higher costs and longer efforts to resort the issue.  
```

## 11 d
```java
SalesPerson[] salesPeople = new SalesPerson[6];
salesPeople[0] = new SalesPerson("100");
salesPeople[1] = new SalesPerson("101");
salesPeople[2] = new SalesPerson("102");
salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
System.out.println(salesPeople[2].getId());
System.out.println(salesPeople[0].getCount());
System.out.println(salesPeople[1].getSalesHistory(0).getValue());
System.out.println(salesPeople[0].calcTotalSales());
```

```
Output:
- 102
- 0
- 
```

## 11 e
```java
public double calcTotalSales() 
{
    double UnitPrice = s.getValue();
    double Total = 0;
    for (int i = 0; i < count; i++) {
        Total += salesHistory[i].getValue() * salesHistory[i].getQuantity();
    }

    return Total;
}
```

## 11 f
// Assuming this is in the main method.
```java
public String highest() {3
    String highestId;
    double HighestTotal = 0;

    for(int i = 0; i < salesPeople[].length; i++) {
        if (salesPeople[i].calcTotalSales() > HighestTotal) {
            HighestTotal = salesPeople[i].calcTotalSales();
            highestId = salesPeople[i].getID()
        }
    }

    return highestId;
}
```

## 11 g
// Assuming this is in the main method.
```java
public void addSales(Sales s, String id) {
    for(int i = 0; i < salesPeople[].length; i++) {
        if(id.equals(salesPeople[i].getID())) {
            salesPerson[i].setSalesHistory(s);
            break;
        }
    }
}
```