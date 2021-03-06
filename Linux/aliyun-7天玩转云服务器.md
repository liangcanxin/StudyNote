# 7天玩转云服务器

## 第1天：云服务器ECS是什么

1. 云服务器（ECS）是一种简单高效、处理能力可弹性伸缩的计算服务，帮助您快速构建更稳定、安全的应用，提升运维效率，降低IT成本，使您更专注于核心业务创新
2. ECS是阿里云产品体系中，最基础的计算服务，通常用作应用程序的运行环境，其最重要的特点是弹性；基于阿里云自主研发的大规模分布式计算系统，通过虚拟化技术整理IT资源，为各行业提供互联网基础设施服务设备
3. ECS是应用的基础运行环境
	应用程序的基础运行环境-每个ECS实例上都运行着用户选择的操作系统，一般是某个Linux或Windows的发行版；用户的应用程序运行在实例的操作系统之上
	最简化的弹性架构-较好的实践是将ECS和其他云计算产品配合使用（例如将使用ECS运行webserver，使用RDS作为数据库，OSS作为文件存储）；但应避免完全将原有物理服务器上的应用都照搬跑到云服务器上
4. ECS的弹性伸缩-ECS最重要的特点
	纵向弹性-即单个服务器的配置变更。传统IDC模式下，很难做到对单个服务器进行变更配置。而对于阿里云，当您购买了云服务器或存储的容量后，可以根据业务量的增长或者减少自由变更自己的配置
	横向弹性-对于游戏应用或直播平台出现的高潮，若在传统IDC模式下，您根本无法立即准备资源；而云计算可以使用弹性方式帮助客户度过这样的高峰。当业务高峰消失时，您可以将多余的资源释放掉，以减少业务成本的开支
5. ECS优势：稳定、弹性、安全、成本、易用性、可拓展性

## 第2天：上云概览-在云服务器上快速搭建个人网站

1. 选型配置
* 适合个人用户的配置
	入门型：1vCPU 1GB内存 1MB宽带
	基础型：1vCPU 2GB内存 1MB宽带
	通用型：2vCPU 4GB内存 1MB宽带
	进阶型：4vCPU 8GB内存 1MB宽带
* 适合企业用户的配置
	内存型：1:8（vCPU:内存）分配，I/O优化，适用Cache/Redis、搜索类、内存数据库等需使用大量内存的应用；
	计算型：最大规格为40核vCPU，224GB内存，可满足CPU密集型超稳定计算需求；
	通用型：Intel Xeon E5 CPU，DDR4内存，最大256Mbps吞吐量，最大20000IOPS随机读写，已成为70%企业用户的选择；
	安全型：购买ECS时直接绑定安全增强服务，DDoS防护阈值10GB起，支持手动解除黑洞，支持5 * 8小时安全事件响应

2. 创建实例-阿里云服务器计费模式（包年包月/按需付费）

3. 创建Web环境：LAMP、LNMP、JAVA、Windows、Node.js Docker

4. 上传网站程序并安装
    WordPress博客平台（含智慧云虚拟面板）
    配置端口：21端口、80端口、3306端口、1777端口、8081端口

  >具体流程：
  >购买云服务器：按需付费、地域、网络安全组（默认）、镜像（WordPress博客平台-含智慧云虚拟面板）
  >管理控制台 -> 网络和安全 -> 安全组（原默认） -> 公网入方向配置端口
  >管理控制台 -> 实例 -> 查看公网IP -> 获取权限
  >按相关文档开始自写博客

## 第3天：云服务器最基本操作-实例管理

* 一个云服务器ECS实例等同于一台虚拟计算机，包含CPU、内存、操作系统、带宽、磁盘等最基础的计算组件；您可以方便的定制、更改实例的配置；您对该虚拟机拥有完全的控制权，和您本地服务器的区别在于，您只需登录到阿里云，即可使用云服务器，进行独立的管理、配置等操作

* 操作系统
	Windows：系统内含正版激活；适合于运行Windows下开发的程序，如.net等；支持SQL Server等数据库（需自行安装）；可以使用远程桌面方式登录进行管理
	Linux：最流行的服务器操作系统，强大的安全性和稳定性；免费且开源，轻松建立和编译源代码；通过SSH方式远程访问您的ECS实例；一般用于高性能web等服务器应用，支持常见的PHP/Python等编程语言，支持MySQL等数据库（需自行安装）
	
	>具体流程：
	>
	>购买云服务器
	>控制台 -> 实例 -> 重置密码
	>Xshell远程访问Linux系统 / Windows自带的远程桌面连接登录Windows系统（用户名默认administrator）
	>
	>运行/停止，释放/自动释放
	>
	>选型配置（续费降配、升级配置、带宽临时升级、转换基础带宽付费方式、首次0Mbps升级...）
	>
	>更换操作系统

## 第4天：云服务器-磁盘管理

* 磁盘
	普通云盘：数据不被经常访问或低I/O负载的应用场景
	SSD云盘：I/O密集型应用，中大型关系数据库，NoSQL数据库
	高效云盘：中小型数据库，大型开发测试，服务器log
	
	>具体操作：
	>控制台 -> 存储 -> 云盘
	>挂载磁盘（Linux/Windows）
	>更换系统盘
	>初始化磁盘
	>扩容系统盘（更换操作系统中实现）
	>扩容数据盘

## 第5天：为应用创建备份-快照管理

快照作为一种便捷高效的数据保护服务手段，推荐应用于以下业务场景中：

* 系统盘、数据盘的日常备份，您可以利用快照定期的对重要业务数据进行备份，来应对误操作、攻击、病毒等导致的数据丢失风险
* 更换操作系统，应用软件升级或业务数据迁移等重大操作前，您可以创建一份或多份数据快照，一旦升级、迁移过程中出现任何问题，可以通过数据快照及时恢复到正常的系统数据状态
* 生产数据的多副本应用，用户可以通过对生产数据创建快照，从而为数据挖掘、报表查询、开发测试等应用提供近实时的真实生产数据

	>具体操作：
	>控制台 -> 产品与服务 -> 本实例磁盘 -> 创建快照
	>设置自动快照策略
	>删除快照/删除策略

## 第6天：轻松复用你搭建好的环境和应用-镜像管理

* 镜像是云服务器ECS实例运行环境的模板，一般包括操作系统和预装的软件。您可以使用镜像创建新的ECS实例和更换ECS实例的系统盘

* 云服务器ECS提供了以下灵活多样的方式让您方便的获取镜像：
	选择阿里云官方提供的公共镜像（支持Linux和Windows的多个发行版本）
	去镜像市场选择第三方服务商（ISV）提供的镜像
	根据现有的云服务器ECS实例创建自定义镜像
	选择其他阿里云用户共享给您的镜像
	您可以把线下环境的镜像文件导入到ECS的集群中生成一个自定义镜像

* 您还可以把自定义镜像复制到其他地域，实现环境和应用的跨地域一致性部署

	>具体操作：
	>快照中创建镜像（只能在系统盘）：
	>控制台 -> 产品与服务 -> 快照列表 -> 创建自定义镜像
	>快照列表 -> 镜像
	>
	>实例中创建镜像（包括系统盘和数据盘）
	>
	>镜像应用：购买云服务器 -> 镜像配置（自定义镜像）
	>共享镜像
	>镜像市场购买镜像/更换系统盘更换镜像

## 第7天：加固你的网站-云上应用的安全

* 安全组是一种虚拟防火墙，具备状态检测包过滤功能。安全组用于设置单台或多台云服务器的网络访问控制，它是重要的网络安全隔离手段，用于在云端划分安全域

* 安全组是一个逻辑上的分组，这个分组是由同一个地域内具有相同安全保护需求并相互信任的实例组成。每个实例至少属于一个安全组，在创建的时候就需要指定。同一个安全组内的实例之间网络互通，不同安全组的实例之间默认内网不通。可以授权两个安全组之间互访

	>具体操作：
	>控制台 -> 产品与服务 -> 安全组 -> 创建安全组
	>公网入方向：添加安全组，设置访问优先级来配置网络访问