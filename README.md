# IT-OOPROG21 - Laboratory Activity 4

## Name
Clyde F. Bastasa

## Section
2A

## Activity
Encapsulation

## Description
This activity refactors the Vehicle program using encapsulation.

The brand, model, and year fields are private. Getters are used to access the values, while setYear() validates changes to the vehicle year.

## Console Output

===== VEHICLE 1 =====
Brand: Toyota
Model: Corolla
Year: 2020
Age: 6
Vintage: false

===== VEHICLE 2 =====
Brand: Honda
Model: Civic
Year: 1995
Age: 31
Vintage: true

===== VEHICLE 3 =====
Brand: Ford
Model: Ranger
Year: 2010
Age: 16
Vintage: false

===== SET YEAR TESTS =====
setYear(2000): true
Stored year: 2000
Age: 26
Vintage: true

setYear(1885): false
Stored year: 2000

setYear(2027): false
Stored year: 2000

===== CONSTRUCTOR TESTS =====
Constructor year 1885: 2026
Constructor year 2027: 2026