# Object Oriented Programming Midterm Exam

- This course is taught by Doç.Dr. Rıza Cenk Erdur in the 5th semester at Ege University Computer Engineering Departmant.

## Summary
1.
  - Write a interface with a 'Shape' name. This interface had include with 2 functions which are return double type and they names are cevreHesapla() and alanHesapla().
  - Circle the class implements the Shape interface. There is a radius variable of double type in the Circle class. Write a constructor method and toString method for the Circle class. The toString method can return information like "Circle, radius = 10.0".
  - The class named Rectangle implements the Shape interface. There are height and width variables of type double in the Rectangle class. Write constructor method and toString method for Rectangle class. The toString method can return information like "Rectangle, height = 8.0 width = 10.0".
  - The class called DikUcgen realizes the Shape interface. There are variables a, b and c of type double in the rectangle class. The variable c is for the hypotenuse. Constructor method will take values corresponding to variables a and b as parameters, calculate the hypotenuse and assign it to variable c. Write the toString method for the Rectangle class. The toString method can return information like "Rectangle, a = 3.0 b = 4.0 c = 5.0". The Rectangle class will also have a method named void tangentValues(). This method will print the tangent value with the System.out.println commands.
  - In the main method of a class called Question1Experiment, define a set of 5 elements of type Shape called shapes. The elements of this directory will be filled with the objects that will be created with the information read from a text file as follows. There is no need for error checking, the text file can be thought of as having 5 elements. In addition, the information in it will be considered to be error-free and the data are written by separating them with a space.
```
girdi.txt
Circle 10.0
Rectangle 5.0 6.0
DikUcgen 3.0 4.0
Circle 20.0
DikUcgen 6.0 8.0
```

- Then you must write information of shapes in the array which are area and perimeter. If there is a Dik Ucgen, you must write a tangent value.

2. 
Create a hierarchy for management, office and employees. Calculate cascadely the salary for each management and office. To represent this hierarchical structure, implement the following classes of this pattern using the "Composite" design pattern.
* Write an abstract class named FirmaBilesen. In this class, there will be an abstract method definition named maliyet() that returns an int type value.
* Write the Calisan class extends from the FirmaBilesen class. In this class, there is a string type adSoyad variable and an int type maas variable. Write a constructor for this class and also implement the maliyet method to return the value of maas.
* Write the Mudurlukler class extends from the FirmaBilesen class. In this class there is an arrayList for holding objects of type FirmaBilesen with a variable. Write a constructor for this class. Then write the ekle method and maliyet method.
* In the main method of a class named Soru2Deneme, perform the sample hierarchy by creating the necessary objects with the following data.
```
Genel Müdürlük (Ali,5000) (Veli,6000) // örneğin Ali ve Veli genel müdürlük çalışanlarıdır.
Ege Bölge Müdürlüğü (Ayse,4000) (Can, 3000) //Ayse ve Can, Ege bölge müd. çalışanıdır...
İzmir il müdürlüğü (Selim,2000) (Murat,1500) (Zeynep,2500)
Akdeniz Bölge Müdürlüğü (Emre,3000) (Ahmet, 4000)
Antalya il müdürlüğü (Bahar,2500) (Sedat, 1500) (Vedat,2500)
```
According to these informations, print out the costs of Ege Bolge Mudurlugu and Akdeniz Bolge Mudurlugu.
