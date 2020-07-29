# Conversion XML Deserialization and Serialization

The program converts the XML format to Java objects from [XmlDeserialization](https://github.com/bbogdasha/conversionXML/blob/master/XmlDeserialization.xml) and vice versa - Java objects to XML format in file [XmlSerialization](https://github.com/bbogdasha/conversionXML/blob/master/XmlSerialization.xml).

### Tech

* XML;
* Jackson.

### Result

**1.** First operation converts XML format to Java objects and display in console:

![Screenshot](https://github.com/bbogdasha/conversionXML/blob/master/screenshots/Screenshot_1.jpg)

**2.** Second operation converts this Java objects:

```java
List<Student> students = new ArrayList<Student>();
students.add(new Student(1, "Felix", "Hodor", 21, false));
students.add(new Student(2, "Bilbo", "Begins", 28, false));
students.add(new Student(3, "Frodo", "Begins", 19, true));
students.add(new Student(4, "Gendalf", "Grey", 89, true));
students.add(new Student(5, "Gimli", "Axe", 24, false));
University university = new University("Cybersecurity", 125, students);
```
to XML format in file [XmlSerialization](https://github.com/bbogdasha/conversionXML/blob/master/XmlSerialization.xml).
Result:

```xml
<University>
  <speciality>Cybersecurity</speciality>
  <number>125</number>
  <students>
    <students>
      <id>1</id>
      <firstname>Felix</firstname>
      <surname>Hodor</surname>
      <age>21</age>
      <budget>false</budget>
    </students>
    <students>
      <id>2</id>
      <firstname>Bilbo</firstname>
      <surname>Begins</surname>
      <age>28</age>
      <budget>false</budget>
    </students>
    <students>
      <id>3</id>
      <firstname>Frodo</firstname>
      <surname>Begins</surname>
      <age>19</age>
      <budget>true</budget>
    </students>
    <students>
      <id>4</id>
      <firstname>Gendalf</firstname>
      <surname>Grey</surname>
      <age>89</age>
      <budget>true</budget>
    </students>
    <students>
      <id>5</id>
      <firstname>Gimli</firstname>
      <surname>Axe</surname>
      <age>24</age>
      <budget>false</budget>
    </students>
  </students>
</University>
```
