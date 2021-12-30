# SpringBoot-配置文件

>  SpringBoot中的配置文件一种有三种后缀格式，分别是： 
>
> ①：.yml
>
> ②：.yaml
>
> ③：.properties

## 配置文件加载优先级

如图所示，三种配置方式均配置了不同的端口

![image-20211229145952988](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291459235.png)

![image-20211229150046343](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291500373.png)

![image-20211229150117918](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291501945.png)

通过实验得知，三种配置方式加载优先顺序依次为：

**application.properties  >  application.yml  >  application.yaml**



## 选择哪种配置方式？

> 根据配置方式来看，yml和yaml格式文件都要优于properties文件。
>
> 因为前两种配置文件的配置更加美观，存在大量配置时更加容易观察到足够的信息（想想XML的配置文件吧，哈哈）
>
> 实际上，目前开发推荐使用yml配置文件

### Yml如何配置？

+ 使用原则：
  1. 大小写敏感
  2. 使用缩进表示层级关系
  3. 缩进长度没有限制，只要元素对齐就表示这些元素属于同一个层级
  4. 使用#号来表示注解
  5. 字符串可以不用引号标注

+ 开发所需配置如何获取？

	1. 进入spring官网，找到相应版本的使用文档，进入文档后找到下方的**Application Properties**即可

![image-20211229152012156](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291520187.png)![image-20211229152101149](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291521176.png)![image-20211229152121998](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291521031.png)

2. 集成其他技术按照类似于方法一去查找相关官方支持文档即可



### Idea可能出现的问题

> 问题：idea无法识别yml格式文件为配置文件，导致无法获取配置提示

**解决办法**：在项目结构中添加配置文件。

![image-20211229152905917](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291529946.png)

![image-20211229152927831](https://cdn.jsdelivr.net/gh/lionlinzq/IMG/Picture/study/netty202112291529860.png)