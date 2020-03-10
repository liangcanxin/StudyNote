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
1. Java关键字是Java语言保留供内部使用的，不能使用关键字作为变量名或方法名
2. 详细的Java关键字/保留字见下表
<table>
	<caption>Java中的关键字/保留字</caption>
	<tr>
		<td>abstract</td>
		<td>assert</td>
		<td>boolean</td>
		<td>break</td>
		<td>byte</td>
		<td>case</td>
		<td>catch</td>
		<td>char</td>
	</tr>
	<tr>
		<td>class</td>
		<td>const</td>
		<td>continue</td>
		<td>default</td>
		<td>do</td>
		<td>double</td>
		<td>else</td>
		<td>extends</td>
	</tr>
	<tr>
		<td>final</td>
		<td>finally</td>
		<td>float</td>
		<td>for</td>
		<td>goto</td>
		<td>if</td>
		<td>implements</td>
		<td>import</td>
	</tr>
	<tr>
		<td>instanceof</td>
		<td>int</td>
		<td>interface</td>
		<td>long</td>
		<td>native</td>
		<td>new</td>
		<td>null</td>
		<td>package</td>
	</tr>
	<tr>
		<td>private</td>
		<td>protected</td>
		<td>public</td>
		<td>return</td>
		<td>short</td>
		<td>static</td>
		<td>strictfp</td>
		<td>super</td>
	</tr>
	<tr>
		<td>switch</td>
		<td>synchronized</td>
		<td>this</td>
		<td>throw</td>
		<td>throws</td>
		<td>transient</td>
		<td>try</td>
		<td>void</td>
	</tr>
	<tr>
		<td>volatile</td>
		<td>while</td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
	</tr>
</table>