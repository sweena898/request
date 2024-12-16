class student
{
string name;
int age;
student(string name, int age)
{
this.name = name;
this.age = age;
System.out.println("Enter the number of rows\n");
int rows = scan.nextInt();
System.out.println("Floyd's Triangle Generated\n");
int count = 1;
for ( int i = 1 ; i <= rows ; i++ )
{
for ( int j = 1 ; j <= i ; j++ )
{
System.out.print(count+" ");
count++;
}
System.out.println();
}
}
}
