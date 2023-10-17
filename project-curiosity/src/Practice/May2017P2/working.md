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

|         SalesPerson            |          
----------------------------------
| - String id;                   |
| - Sales[] salesHistory;        | <>--------
| - int count;                   |
----------------------------------
| + void setSalesHistory(Sales s)|
| + double calcTotalScales()     |
```

## 11 c ii.
```
Through the over dependency of the Sales object on SalesPerson, negative implications could emerge. For instance, through the change in names of the methods or class, this may cause extensive bugs and errors requiring higher costs and longer efforts to resort the issue.  
```