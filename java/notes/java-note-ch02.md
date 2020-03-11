# Java学习笔记

**备注：该笔记可参考 [速学堂java学习](https://www.sxt.cn/Java_jQuery_in_action/Java_Note.html)**

## 第二章 数据类型和运算符

### 2.1 注释
1. 注释方式：
* 单行注释：使用“//”开头，“//”后面的单行内容均为注释
* 多行注释：以“/\*”开头，以“\*/”结尾，在二者之间的内容为注释，也可以作为行内注释，但是需要注意的是多行注释不能嵌套使用
* 文档注释：以“/\*\*”开头，以“\*/”结尾，注释中包含一些说明性的文字以及一些JavaDoc标签（后期写项目时，可以生成项目的API）

2. 示例

```java
/**
* Welcome类（文档注释）
* @author codeworker
* @version 1.0
*/
public class Welcome{
    //单行注释
    public static void main(String[] args/*行内注释*/){
    	System.out.println("Hello World!");
    }
    /* 
      多行注释
      多行注释
     */
}
```

### 2.2 标识符
1. 标识符：用来给变量、类、方法以及包进行命名的，如Welcome、name等
2. 标识符命名规则：
* 标识符必须以字母、下划线、美元符号开头
* 标识符其他部分可以是字母、下划线、美元符号和数字的任意组合
* Java标识符大小写敏感，且长度无限制
* 标识符不可以是Java的关键字

3. 标识符使用规范：
* 表示类名：每个单词的首字母大写，如Man、GoodMan
* 表示方法/变量：第一个单词小写，其余单词首字母大写，如eat()、eatFood()
* 注意： **不建议使用中文来定义标识符**

4. 示例

```java
/** 
* 测试标识符的用法
* @author:codeworker
*/
public class TestIdentifer{
    public static void main(String[] args){
        int a123 = 1;
        //int 123a = 2;		//数字不能开头
        int $a = 3;
        int _abc = 4;
        //int #abc = 5;
        
        int 年龄 = 18;		//可以使用中文，但是不建议
        //int class = 2;	//关键字不能作为标识符
    }
}
```

### 2.3 Java关键字/保留字
Java关键字是Java语言保留供内部使用的，不能使用关键字作为变量名或方法名。不需要专门记忆，使用多了自然就记住了。

### 2.4 变量
1. 变量的本质：代表一个“可操作的存储空间”
	*注：变量在使用前必须对其声明，只有声明后，才能为其分配存储空间*
2. 示例：

```java
double salary;
long earthPopulation;//long类型的分配空间为8个字节
int age;			//int类型的分配空间为4个字节
int i,j;			//可一行声明多个变量，但是不建议，其可读性较差
double e = 2.718282828;//可将变量的声明和初始化放在同一行中
```

3. 变量分类
|类型|声明位置|从属于|生命周期|注意事项|
|:-----:|:-----:|:-----|:-----|:-----|
|局部变量|方法或语句块内部|方法或语句块|从声明位置开始，直到方法或语句块执行完毕，局部变量消失|在使用前必须先声明、初始化（赋初值）再使用|
|成员变量（实例变量）|类内部，方法外部|对象|对象创建，成员变量也跟着创建，对象消失，成员变量也跟着消失|如果不自行初始化，会自动初始化为该数据类型的默认初始值|
|静态变量（类变量）|类内部，static修饰|类|类被加载，静态变量就有效；类被卸载，静态变量消失|如果不自行初始化，与成员变量相同会自动赋初值|
*注：与成员变量和静态变量相关的知识，在后面会再次讲解*

4. 示例：

```java
public class TestVariable{
    int a;		//成员变量，从属于对象，成员变量会自动被初始化
    static int size;	//静态变量，从属于类
    
    public static void main(String[] args){
        {
            int age;	//局部变量，从属于语句块
            age = 18;
        }
        int salary = 3000;//局部变量，从属于方法
        
        int i;
        //int j = i + 5;//编译出错，变量i还没有初始化
    }
}
```

### 2.5 常量
常量类型：
* 字面常量：如1、2、3、‘a’、‘b’、true、false、“hello”等
* 符号常量：用final修饰的常量，如以下的PI：

```java
final double PI = 3.14159;
//PI = 3.15;	//编译出错，常量一旦被初始化，即不可改其值
```

*建议*
* 所有变量、方法、类名：见名知意
* 类成员变量：首字母 **小写** 和驼峰原则，如monthSalary
* 局部变量：首字母 **小写** 和驼峰原则
* 常量：大写字母和下划线，如MAX_VALUE
* 类名：首字母 **大写** 和驼峰原则，如GoodMan
* 方法名：首字母 **小写** 和驼峰原则，如calSalary()

### 2.6 基本数据类型
Java中定义了3类8种基本数据类型
* 数值型
	- 整数类型：byte、short、int、long
	- 浮点类型：float、double
* 字符型：char
* 布尔型：boolean

>注：
1.与C++区别，Java整型的范围与处理器无关，使其有很强的移植能力；
2.Java语言的整型常数默认为 int型，声明 long型常量可以后加 ’l‘或 ’L‘；
3.绝大部分应用程序采用double型浮点数，默认的浮点型常量也是double；
4.浮点类型数据不适合于不容许舍入误差的金融计算领域，其多使用BingDecimal类；
5.对于无法直接写出的字符型，可采用转移字符，如 ‘\n'；

**雷区：不要使用浮点数进行比较，在需要进行比较的时候，请使用BigDecimal类**

**建议：当写判断语句：if(flag == true)时，建议写法为if(flag)，可避免低级错误**

示例一：长整数类型赋值

```java
long a = 55555555;	//编译成功，在int型表示的范围内（21亿内）
//long b = 5555555555555;//不加L编译错误，超过int范围
long b = 5555555555555L;//编译成功
```

示例二：科学记数法赋值浮点数

```java
double f = 314e2;	//314*10^2
double f2 = 314e-2;	//314*10^(-2)
```

示例三：浮点数比较存在的问题

```java
float f = 0.1f;	//声明赋值为float类型
double d = 1.0/10;
System.out.println(f==d);//结果为false

float d1 = 423432423f;
float d2 = d1 + 1;
System.out.println(d1==d2);//结果为true
```

示例四：BigDecimal进行浮点数比较

```java
import java.math.BigDecimal;
public class Main{
    public static void main(String[] args){
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);//0.5
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001
    }
}
```

### 2.7 运算符
* 算术运算符
	- 二元运算符：+，-，\*，/，%
	- 一元运算符：++，--
* 赋值及其扩展运算符：+=，-=，\*=，/=，%=
* 关系运算符：==，！=，>，>=，<，<=
* 常用逻辑运算符：与或非（&、|、！）
* 位运算符（少用，至少我很少用）
* 字符串连接符：+（常用于输出数据和字符串的连接）
* 条件运算符格式：x?y:z

>注：
>=是赋值运算符，而真正的判断两个操作数是否相等的运算符是==
>==、！=是所有（基本和引用）数据类型都可以使用
>\>、>=、<、<=仅针对数值类型（byte/short/int/long，float/double，char）
>i++和++i不要太深究，大概理解意思即可
>运算符优先级不需刻意记忆，不清楚时，使用小括号组织即可
>但是，对于常用的逻辑运算符优先级，切记“逻辑非>逻辑与>逻辑或”

示例：三目条件运算符

```java
int score = 80;
int x = -100;
String type = score<60?"不及格":"及格";
int flag = x>0?1:(x==0?0:-1);
System.out.println("type="+type);
System.out.println("flag="+flag);
```

### 2.8 类型转换
* 自动类型转换：容量小的数据类型可以自动转换为容量大的数据类型，可以将整型常量直接赋值为byte、short、char等类型变量，而不需要进行强制类型转换，只要不超出其表数范围即可
示例：

```java
short b1 = 12;	//合法
short b2 = 1234567;//非法，1234567超出short的表数范围
```

* 强制类型转换：又称造型，用于显式的转换一个数值的类型，但有可能会丢失信息，造成精度降低或溢出
示例：

```java
double x = 3.14;
int nx = (int)x;	//值为3
char c = 'a';
int d = c+1;
System.out.println(nx);
System.out.println(d);
System.out.println((char)d);
```
	
* 类型转换常见错误
**常见问题一：操作比较大的数，要留意是否溢出，尤其是整数操作**

```java
int money = 1000000000;//10亿
int years = 20;
int total = money*year;//返回total为负数，超过了int范围
System.out.println("total="+total);
long total2 = money*year;
//返回的total2仍然为负数，因为是先int计算，后转为long，已经丢失数据
System.out.println("total2="+total2);
long total3 = money*((long)years);
//返回的total3正确，先将其中一个因子变为long，整个表达式发生提升，全部用long来计算
System.out.println("total3="+total3);
```
	
**常见问题二：不要命名为l的变量，l容易和1混淆，long类型使用大写L不要用小写**

```java
int l = 2;//分不清是L还是1
long a = 23451l;//建议使用大写L
System.out.println(a+l);
```
	

### 2.9 简单的键盘输入和输出
* 简单的键盘输出采用System.out.print(...)或System.out.println(...)
* 而键盘输入则采用Scanner方式，具体见以下示例

```java
import java.util.Scanner;
public class TestScanner{
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入名字：");
    String name = scanner.nextline();
    System.out.println("请输入爱好：");
    String favor = scanner.nextline();
    System.out.println("请输入年龄：");
    int age = scanner.nextInt();
    
    System.out.println("##############");
    System.out.println(name);
    System.out.println(favor);
    System.out.println("来到地球的天数"+age*365);
}
```

*未完，待续 ~*