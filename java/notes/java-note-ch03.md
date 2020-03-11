# Java学习笔记
**声明：本笔记具体可参考 [速学堂学习网站](https://www.sxt.cn/Java_jQuery_in_action/History_Direction.html)**

## 第三章 控制语句
### 控制语句
* ”顺序结构“：代表”先执行a，再执行b“的逻辑
* ”选择结构“：代表”如果……，则……“的逻辑
* ”循环结构“：代表”如果……，则再继续……“的逻辑
*语录：上述三种流程控制语句就能表示所有的事情！*

### 选择结构
* if单选择结构
	- 示例：

	```java
	import java.util.Scanner;
	public class Test1{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入能被5整出的数：")
            int num = scanner.nextInt();
            if(num%5!=0){//当if语句不写{}，只能作用在后面的第一条语句；建议任何时候都写上{}，即使里面只有一句话
                System.out.println("您的输入有误！");
            }
        }
	}
	```

* if-else双选择结构
	- 示例

	```java
	import java.util.Scanner;
	public class Test2{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数：")
            int num = scanner.nextInt();
            if(num%2!=0){
                System.out.println("该数为奇数");
            }else{
                System.out.println("该数为偶数");
            }
        }
	}
	```

	*补：可以用if-else替代条件运算符*

	- 示例

	```java
	import java.util.Scanner;
	public class Test3{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数：")
            int num = scanner.nextInt();
            System.out.println(num%2！=0?"该数为奇数"："该数为偶数");
        }
	}
	```

* if-else if-else多选择结构

	- 示例

	```java
	public class Test4{
        public static void main(String[] args){
            int i = (int)(100*Math.random())+1;//该方式可以生成随机数
            System.out.print("分数为"+i);
            if(i>=85){System.out.print(" 评级为A");}
            else if(i>=70){System.out.print(" 评级为B");}
            else if(i>=60){System.out.print(" 评级为C");}
            else{System.out.print(" 评级为D");}
        }
	}
	```

* switch结构

	- 示例

	```java
	public class Test5{
        public static void main(String[] args){
            int i = (int)(100*Math.random())+1;//该方式可以生成随机数
            System.out.print("分数为"+i);
            i = i/10;
            switch(i){
                case 9:
                case 8:
                	System.out.println(" 评级为A");break;
                	//假定大于等于80评级为A
                case 7:
                	System.out.println(" 评级为B");break;
                case 6:
                	System.out.println(" 评级为C");break;
                default:
                	System.out.println(" 评级为D");
            }
        }
	}
	```

### 循环结构
* while循环

	- 示例

	```java
	public class Test6{
        public static void main(String[] args){
            int i = 0;
            int sum = 0;
            //1+2+3+...+100=?
            while(i<=100){
                sum += i;//相当于sum=sum+i
                i++;
            }
            System.out.println("Sum="+sum);
        }
	}
	```

* do-while循环

	- 示例

	```java
	public class Test7{
        public static void main(String[] args){
            int i = 0;
            int sum = 0;
            //1+2+3+...+100=?
            do{
                sum += i;//相当于sum=sum+i
                i++;
            }while(i<=100);//此处的;不能省略
            System.out.println("Sum="+sum);
        }
	}
	```

	*补：while语句和do-while语句区别在于do-while语句总是保证循环体至少会被执行一次，而while语句可能不执行*
	
* for循环

	- 示例

	```java
	public class Test8{
        public static void main(String[] args){
            int sum = 0;
            //1+2+3+...+100=?
            for(int i = 0;i<=100;i++){
                sum += i;
            }
            System.out.println("Sum="+sum);
        }
	}
	```

	*补：可以在for循环中嵌入逗号运算符*

	- 示例

	```java
	public class Test9{
        public static void main(String[] args){
            for(int i = 1, j = i + 10;i < 5;i++, j = i *2){
                System.out.println("i="+i+" j="+j);
            }
        }
	}
	```

	*提示：
	编译器将while（true）与for（；；）看作同一回事，都指的是无限循环
	在for语句的初始化部分声明的变量，如for（int i = 0；...)，其作用域为整个for循环体，不能在循环外部使用该变量。*

### 嵌套循环
在一个循环语句内部再嵌套一个或多个循环，称为嵌套循环。while、do-while与for循环可以任意嵌套多层

示例：

```java
public class Test10{
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j<0?(" "+i*j):i*j)+" ");
            }
            System.out.println();
        }
    }
}
```

### break语句
在任何循环语句的主体部分，均可用break控制循环的流程。break用于强行退出循环，不执行循环中剩余的语句

示例：

```java
public class Test11{
    public static void main(String[] args){
        int total = 0;//定义计数器
        System.out.println("Begin");
        while(true){
            total++;
            int i = (int)Math.round(100*Math.random());
            if(i==88){
                break;
            }
        }
        System.out.println("Game over, used "+total+"times.");
    }
}
```

### continue语句
continue语句用在循环体中，用于终止某次循环过程，即跳过循环体中尚未执行的语句，接着进行下一次是否执行循环的判定

*注意
continue用在while，do-while中，continue语句立刻跳到循环首部，越过了当前循环的其余部分；
continue用在for循环中，跳到for循环的迭代因子部分*

示例：

```java
public class Test12{
    public static void main(String[] args){
        int count = 0;//定义计数器
        for(int i = 100;i<150;i++){
            //如果是3的倍数，则跳过本次循环，继续进行下一次循环
            if(i%3==0){
                continue;
            }
            //否则（不是3的倍数），输出该数
            System.out.print(i+"、");
            count++;
            //根据计数器判断每行是否已经输出5个数
            if(count%5==0){
                System.out.println();
            }
        }
    }
}
```

*补：
带标签的break和continue，对于Java来说只用在循环语句之前，用于在其中嵌套另一个循环，由于break和continue关键字通常只中断当前循环，但若随同标签使用，它们就会中断到存在标签的地方*

示例：

```java
//控制嵌套循环跳转打印101-150之间所有的质数
public class Test13{
    public static void main(String[] args){
        outer:for(int i=101;i<150;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.print(i+" ");
        }
    }
}
```

### 语句块
语句块，确定了局部变量的作用域，其中的程序代码，作为一个整体，是要被一起执行的。块可以被嵌套在另一个块中，但不能在两个嵌套的块内声明同名变量；语句块可以使用外部的变量，而外部不能使用语句中定义的变量，因为语句块中定义的变量作用域只限于语句块

示例：

```java
public class Test14{
    public static void main(String[] args){
        int n;
        int a;
        {
            int k;
            int n;//编译错误，不能重复定义变量n
        }//变量k的作用域到此为止
    }
}
```

### 方法
方法就是一段用来完成特定功能的代码片段，类似于其他语言的函数

示例：

```java
public class Test15{
    //main方法：程序的入口
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        //调用求和方法，将num1与num2的值传给add方法中的n1与n2，求完和后将结果返回，用sum接收结果
        int sum = add(num1,num2);
        System.out.println("sum="+sum);//输出sum=30
        //调用打印的方法，该方法没有返回值
        print();
    }
    //求和方法
    public static int add(int n1,int n2){
        int sum = n1 + n2;
        return sum;//使用return返回计算的结果
    }
    //打印的方法，没有返回值，用void指定
    public static void print(){
        System.out.println("这是print（）");
    }
}
```

*注意：
1.实参的数目、数据类型和次序必须和所调用的方法声明形式参数列表匹配
2.return语句终止方法的运行并指定要返回的数据
3.Java中进行方法调用中传递参数时，遵循值传递的原则（传递的都是数据的副本）
4.基本类型传递的是该数据值的copy值
5.引用类型传递的是该对象引用的copy值，但指向的是同一个对象*

### 方法重载
* 方法重载是指定义多个方法名相同，但参数不同的方法；调用时，会根据不同的参数自动匹配对应的方法；重载方法实际是完全不同的方法，只是名称相同而已

* 构成方法重载的条件：

1.不同的含义：形参类型、形参个数、形参顺序不同
2.只有返回值不同不构成方法的重载
3.只有形参的名称不同，不构成方法重载

* 示例

```java
public class Test16{
    public static void main(String[] args){
        System.out.println(add(3,5));//8
        System.out.println(add(3,4,10));//18
        System.out.println(add(3.0,5));//8.0
        System.out.println(add(3,5.0));//8.0
    }
    //求和方法
    public static int add(int n1,int n2){
        return n1+n2;
    }
    //方法名相同，参数个数不同，构成重载
    public static int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    //方法名相同，参数类型不同，构成重载
    public static double add(double n1,double n2){
        return n1+n2;
    }
    //方法名相同，参数顺序不同，构成重载
    public static double add(int n1,double n2){
        return n1+n2;
    }
    //编译错误：只有返回值不同，不构成方法重载
    public static double add(int n1,int n2){
        return n1+n2;//返回值double类型
    }
    //编译错误：只有参数名称不同，不构成方法重载
    public static int add(int n2,int n1){
        return n1+n2;
    }
}
```

### 递归结构
* 递归是一种常见的解决问题的方法，其基本思想是“自己调用自己”，一个使用递归结构的方法将会直接或间接的调用自己

* 示例：使用递归求n！

```java
public class Test17{
    public static void main(String[] args){
        long d1 = System.currentTimeMillis();//获取当前时间
        System.out.printf("%d阶乘的结果是：%n",10,factorial(10));
        long d2 = System.currentTimeMillis();//获取运行上一条命令后的当前时间
        System.out.printf("递归费时：%s%n",d2-d1);
    }
    //求阶乘的方法
    static long factorial(int n){
        if(n==1){//递归头
            return 1
        }else{//递归体
            return n*factorial(n-1);//n!=n*(n-1)
        }
    }
}
```

* 递归缺陷

	简单的程序是递归的优点，但是递归调用会占用大量的系统堆栈，内存消耗多，在递归调用层次多时速度比要循环慢的多，所以在使用递归时要慎重
	
* 示例：使用循环求n！

```java
public class Test18{
    public static void main(String[] args){
        long d3 = System.currentTimeMillis();
        int a = 10;
        int result = 1;
        while(a>1){
            result *= a*(a-1);
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("普通循环费时：%s%n",d4-d3);
    }
}
```

*未完，待续 ~*