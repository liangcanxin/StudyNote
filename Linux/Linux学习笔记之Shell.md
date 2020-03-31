# Linux学习笔记
**此为本人大学慕课的笔记，具体视频[点击这里](https://www.icourse163.org/spoc/learn/HNNY-1451765171?tid=1452238457#/learn/announce)**

## 项目2 初试Shell
### 2.1 Shell概述
1. Shell是介于使用者和操作系统核心程序（*Kernel*）间的一个接口；是Linux的命令行
2. Shell
* Bourne Shell（/bin/sh，/bin/bash）
* C Shell（/bin/csh，/bin/tcsh）
* Korn Shell

3. Bash：包括早期的Bourne Shell和Korn Shell的所有功能，并且加入了C Shell的某些功能（**它是各种Linux操作系统的默认Shell**）
4. 使用Shell方法
* 图形界面
    + 终端窗口
    + 虚拟终端（打开：Ctrl+Alt+F2或Ctrl+Alt+F6，返回：Ctrl+Alt+F1）

* 文字界面

5. 终端前面的内容-- **\[root@sjh-com ~\]#**
* 当前登录用户名为root
* 主机名为sjh-com
* 当前目录为~（*为主目录*）
* #为提示符（*超级用户，如果是 $提示符，则为普通用户*）

6. 切换账户的命令：su
    命令格式：su 	\[-\] 	\[用户名\]
    su  等价于 su 	root
    su sjh
    扩展部分： -  选项的作用

### 2.2 文件及目录管理命令
1. 命令列表
* 拷贝文件：cp
    + 命令格式：cp	\[-f i r\]	源文件	目标文件
    + -f 表示直接覆盖
    + -i 表示征求用户意见（y/n）
        - cp	/etc/password	/tmp
        - cp	-r	/etc/yum	/tmp
* 移动文件：mv
    + 命令格式：mv	\[-f i\]	源文件	目标文件
        - mv	/tmp/yum	/etc
        - mv	\*.c	/home/sjh
        - mv	test.txt	test2.txt
* 删除文件或目录：rm
    + 命令格式：rm	\[-f -i -r\]	文件名或目录名
        - rm	/tmp/\*
        - rm	-rf	/tmp/\*
* 列出文件和目录：ls
    + 命令格式：ls	\[-l i d a\]	\[文件名或目录名\]
        - ls
        - ls	-l
        - ls	-a	/root
        - ls	-dil	/root
* 创建目录：mkdir
    + 命令格式：mkdir	\[-p\]	目录名
        - mkdir	~/tools
        - mkdir	-p	zzti/cs/wl15
* 删除目录：rmdir
    + 命令格式：rmdir	\[-p\]	目录名
        - rmdir	-p	zzti/cs/wl15
* 查看当前工作目录：pwd
* 切换目录：cd
    + 命令格式：cd	[路径名]
        - cd
        - cd	~
        - cd	..
        - cd	-
        - cd	/
        - cd	/boot/grub
* 查看文件和目录：find、locate
* 查看文件类型：file
    + 命令格式：file	文件名
        - file	/bin/ls
        - file	/etc/passwd

### 2.3 Linux的运行级别
1. 运行级别（*runlevel*）：操作系统当前正在运行的功能级别，定义在/etc/inittab文件中
2. Linux的7种运行级别
* 0	halt	关机、代表系统停机状态
* 1	Single user mode	单用户模式，只支持root账户
* 2	Multiuser，without NFS	不支持网络文件系统的多用户模式
* 3	Full Multiuser mode	完全多用户模式
* 4	unused	系统未使用，用作保留
* 5	X11	图形界面的多用户模式
* 6	Reboot	重启

3. 不同运行级别可以相互切换，本质上并没有级别功能差异

*补：如果丢失了root账户的口令，可以让机器启动进入单用户模式，然后使用passwd命令来重置root的密码*

4. 运行级别原理
	在目录/ect/rc.d/init.d下有许多服务器脚本程序，一般称为服务（*service*）
	在/etc/rc.d下有7个名为rcN.d（*N的取值为0~6*）的目录，对应系统的7个运行级别
	rcN.d目录下都是一些符号链接文件，这些文件都指向init.d目录下的service脚本文件，这些链接文件命名规则为K+nn+服务名或S+nn+服务名，其中nn为两位数字
	系统会根据指定的运行级别进入对应的rcN.d目录，并按照文件名顺序检索目录下的链接文件：对于以K（*Kill*）开头的文件，系统将终止对应的服务；对于以S（*Start*）开头的文件，系统将启动对应的服务
	
5. 运行级别相关操作
* 查看运行级别：runlevel
* 进入其他运行级别：init N（*N的取值为0 1 2 3 4 5 6*）

6. CentOS7.3中设置运行级别的命令
* 查看运行级别：systemctl get-default
* 修改为运行级别3：systemctl set-default multi-user.target
* 修改为运行级别5：systemctl set-default graphical.target

### 2.4 Linux下常用的快捷键
具体见下表
<table>
	<tr>
		<th>命令</th>
		<th>功能</th>
	</tr>
	<tr>
		<td rowspan=3>Tab</td>
		<td>命令补全</td>
	</tr>
	<tr>
		<td>文件名或路径补全</td>
	</tr>
	<tr>
		<td>连续按2次Tab键，显示已输入字符开头的所有命令、文件名或路径</td>
	</tr>
	<tr>
		<td rowspan=3>Ctrl+D</td>
		<td>退出终端</td>
	</tr>
	<tr>
		<td>如处于编辑状态，则直接退出编辑状态</td>
	</tr>
	<tr>
		<td>从光标处向右删除</td>
	</tr>
	<tr>
		<td rowspan=2>Ctrl+C</td>
		<td>结束当前执行的命令</td>
	</tr>
	<tr>
		<td>取消当前命令行的编辑</td>
	</tr>
	<tr>
		<td>Ctrl+L</td>
		<td>终端清屏</td>
	</tr>
	<tr>
		<td>Ctrl+Z</td>
		<td>将正在运行的程序送到后台</td>
	</tr>
	<tr>
		<td>Ctrl+R</td>
		<td>搜索历史命令</td>
	</tr>
	<tr>
		<td>Ctrl+A</td>
		<td>移动光标到所在行的行首</td>
	</tr>
	<tr>
		<td>Ctrl+E</td>
		<td>移动光标到所在行的行尾</td>
	</tr>
	<tr>
		<td>Ctrl+U</td>
		<td>输入了错误的命令，使用该快捷键会擦除从当前光标位置到行首的全部内容</td>
	</tr>
	<tr>
		<td>Ctrl+K</td>
		<td>输入了错误的命令，使用该快捷键会擦除从当前光标位置到行尾的全部内容</td>
	</tr>
	<tr>
		<td>Ctrl+W</td>
		<td>擦除光标位置前的单词；如果光标在一个单词本身上，它将擦除从光标位置到该单词词首的全部字母</td>
	</tr>
	<tr>
		<td>Ctrl+Y</td>
		<td>粘贴使用Ctrl+W、Ctrl+U和Ctrl+K快捷键擦除的文本</td>
	</tr>
</table>

*未完，详见下一章节 ~*