import java.util.Objects;

public class Student {
 int age;
 String name;

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;     //  сраниваем объект o с текущим объектом (ссылки)
  if (o == null || getClass() != o.getClass()) return false;  // Далее идет сравнение классов, тут неважно какой инстанс объекта у вас создан, getClass() будет одинаковым
  Student student = (Student) o;   // дальше  мы сравниваем значения полей классов
  return age == student.age && Objects.equals(name, student.name);
 }

 @Override
 public int hashCode() {
  return Objects.hash(age, name); // Этот метод возвращает hash code объекта.

  //Если мы переопределяете equals() то вы и обязаны переопределить hashCode() потому что эти два метода взаимосвязаны
 }
}
