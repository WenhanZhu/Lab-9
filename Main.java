import  java.io.*;
import java.util.ArrayList;

 class Main {
static ArrayList<Person>people;
public static void main(String[] args) {
  String name="";
  String age="";
  String color="";
ArrayList<Person> people= new ArrayList<Person>();

people.add(new Person("Wenhan",22,"pink"));
people.add(new Person("A",87,"pink"));
people.add(new Person("B",13,"yellow"));
people.add(new Person("C",55,"black"));
people.add(new Person("D",4,"green"));


try {
  FileWriter writer=new FileWriter("data.txt");
  BufferedWriter bufferW = new BufferedWriter(writer);

for(int i=0; i< people.size();i++){
  bufferW.write(people.get(i).getName());
  bufferW.newLine();
  bufferW.write(Integer.toString(people.get(i).getAge()));
  bufferW.newLine();
  bufferW.write(people.get(i).getColor());
  bufferW.newLine();
  bufferW.flush();
  
}
bufferW.close();
}

catch (IOException exception) {
  System.out.println("An error occurred: " + exception);
}

try{
FileReader myFile;
  myFile = new FileReader("data.txt");
  BufferedReader reader = new BufferedReader(myFile);

while (reader.ready()) {
  name = reader.readLine();
  age = reader.readLine();
  color = reader.readLine();
  System.out.printf("%-10s %-10s %-10s %n", name, age, 
color);;
}
reader.close();}
catch (IOException exception) {
  System.out.println("An error occurred: " + exception);
}




}}












