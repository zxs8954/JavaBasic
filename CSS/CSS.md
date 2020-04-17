[TOC]

# 1、什么是CSS

如何学习

​	1.CSS是什么

​	2.CSS怎么用

​	3.**CSS选择器（重点+难点）**

​	4.美化网页（文字，阴影，超链接，列表，渐变。。。）

​	5.盒子模型

​	6.浮动

​	7.定位

​	8.网页动画

### 1.1、什么是CSS

Cascading Style Sheet层叠样式表

CSS：表现（美化网页）

字体，颜色，边距，高度，宽度，背景图片，网页定位，网页浮动。。。。

### 1.2、发展史

CSS1.0

CSS2.0	DIV（块）+CSS，HTML与CSS分离的思想，网页变得简单，SEO

CSS2.1	浮动和定位

CSS3.0	圆角，边框，阴影，动画。。   浏览器兼容性~



练习格式:![1587129112173](C:\Users\89546\AppData\Roaming\Typora\typora-user-images\1587129112173.png)

### 1.3、快速入门

style

**基本入门：**

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
            <!--规范, <style> 可以编写css的代码，每一个声明，以分号结尾
            语法：
                    选择器{
                声明1;
                声明2;
            }
            -->
        h1{
            color:red;
        }
    </style>
</head>
<body>
<h1>我是标题</h1>
</body>
</html>
```

建议使用这种规范：

![1587129707512](C:\Users\89546\AppData\Roaming\Typora\typora-user-images\1587129707512.png)

指向了html



css优势：

​	1.内容和表现分离

​	2.网页结构表现统一，可以实现复用

​	3.样式十分丰富

​	4.建议使用独立于HTML的CSS文件

​	5.利用SEO，容易被搜索引擎收入

​	

### 1.4、CSS的3中导入方式

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!--    外部样式-->
    <link rel="stylesheet" href="css/style.css">
	<!--内部样式-->
    <style>
            h1{
                color: green;
            }
    </style>

</head>
<body>
<!--优先级：就近原则-->
<!--优先级：行内样式》内部样式》外部样式-->
<!--行内样式，在标签元素中，编写style-->
<h1 style="color: red">标题</h1>
</body>
</html>
```

扩展：外部样式的2中写法

- 链接式   

  html标签

  ```
  <!--    外部样式-->    <link rel="stylesheet" href="css/style.css">
  ```

- 导入式

  css2.1

  ```
  <style>    @import url(css/style.css);</style>
  ```

  不常用

# 2、选择器

> 作用：选择页面上的某一个或者某一类



### 2.1、基本选择器

1、标签选择器

2、类选择器 class

3、id选择器    /*id选择器  id必须保证全局唯一！！    #id名{}*/

### 2.2、层次选择器

 	1、后代选择器		在某个元素的后面		爷爷 爸爸 儿子

```
/*
        后代选择器
        */
        body p{
            background: red;
        }

```

​	2、子选择器   一代 

```css
/*子选择器*/
        body>p{
            background: yellow;
        }
```

​	3、相邻兄弟选择器  同辈

```css
/*兄弟选择器,只有一个，相邻，向下*/
        .active+p{
            background: #82ff32;
         }
```

​	4、通用选择器

```css

        /*!*通用选择器*!*/
        .active~p{
            background: brown;
        }
```



### 2.3、结构伪类选择器

伪类：条件

[TOC]



```css
/*ul的第一个子元素*/
        ul li:first-child{
            background: #82ff32;
        }
        /*ul的最后一个选择器*/
        ul li:last-child{
            background: red;
        }
        /**/
```

```css
/*选择父元素下，第二个类型为p的元素*/
        p:nth-of-type(2){
            background: green;
        }
```

```css
/*选中p1 定位到父元素，选择当前第一个元素
            选择当前元素p父级元素，选中父级元素第一次，并且是当前元素才生效
        */
        p:nth-child(1){
            background: #82ff32;
        }
```

### 2.4、属性选择器（常用）

```css
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        .demo a{
            float: left;
            display: block;
            height: 50px;
            width: 50px;
            border-radius: 10px;
            background: blue;
            text-align: center;
            color: gainsboro;
            text-decoration: none;
            margin-right: 5px;
            font:bold 20px/50px Arial;
        }
        /*存在id的元素
            a[]{}
        */
        /*a[id]{*/
        /*    background: yellow;*/
        /*}*/
        /*
            属性名, 属性名=属性值（正则）
            =绝对等于
            *=包含这个元素
            ^=以这个开头
            $=以这个结尾
        */
        a[id=first]{
            background: #82ff32;
        }
        a[class*="links"]{
            background: fuchsia;
        }
        /*选中以href中以http开头的元素*/
        a[href^=http]{
            background: red;
        }
        a[href$=pdf]{
            background: black;
        }
    </style>
</head>
<body>
<p class="demo">
    <a href="http://www.baidu.com" class="links item first" id="first">1</a>
    <a href="" class="links item active" target="_blank" title="test">2</a>
    <a href="images/123.html" class="links item active">3</a>
    <a href="images/345.html" class="links item">4</a>
    <a href="images/66.jpg">5</a>
    <a href="abc">6</a>
    <a href="/a.pdf">7</a>
    <a href="/abc.pdf">8</a>
    <a href="abc.doc">9</a>
    <a href="abcd.doc" class="links item last">10</a>
</p>
</body>
</html>
```

```css
=绝对等于
*=包含等于
^=第一个
$=最后一个
```



# 3、美化网页元素

### 3.1、为什么美化网页

1、有效传递网页信息

2、美化网页

3、凸显页面主题

4、提高用户体验

span标签：重点突出的字，使用这个标签套起来

```css
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        #title1{
            font-size: 50px;
        }
    </style>
</head>
<body>
java
<br>
欢迎使用<span id="title1">java</span>
</body>
</html>
```

### 3.2、字体样式

```css
<!--  font-family：字体
        font-size：大小
        font-weight:字体粗细
        color:字体颜色
  -->
    <style>
        body{
            font-family:楷体;
        }
        h1{
            font-size: 50px;
            font-weight: lighter;
        }
        .p1{
            font-weight: bold;
            color: #82ff32;
            font-size: 60px;
        }
    </style>
```

### 3.3、文本样式

1、颜色   color    rgb

2、文本对齐方式		text-aligin=center

3、首行缩进		text-indent: 2em

4、行高		line-height

5、装饰		text-decoration: underline

6、文本图片水平对齐：vertical-align: middle;

```css
<style>
        /*水平对齐   参照物  a,b*/
        img,span{
                vertical-align: middle;
        }
    </style>
```





```css
<!--
        颜色：
            单词
            RGB 0~F
            RGBA A:0~1
            text-align  排版居中
            text-indent: 2em段落首行缩进2个字母
            line-height: 50px;  行高
-->
    <style>
        h1{
            color: rgba(0,255,255,0.9);
            text-align: center;
        }
        .p1{
            background: #82ff32;
            text-indent: 2em;
            line-height: 50px;
            height: 400px;
        }
        .l1{
            text-decoration: underline;
        }
        .l2{
            text-decoration: overline;
        }
        /*a标签去下划线*/
        a{
            text-decoration: none;
        }

    </style>
```

### 3.4、阴影

```css
/*text-shadow 阴影颜色  水平偏移  垂直便宜  阴影半径*/
        #price{
            text-shadow: black 10px 10px 0px;
            color: black;
        }
```

### 3.5、超链接伪类

```css
 /*鼠标悬浮的颜色*/
        a:hover{
            color: fuchsia;
        }
        /*鼠标按住未释放的状态*/
        a:active{
            color: red;
            font-size: 100px;
        }
        /*点完之后的颜色*/
        a:visited{
            color: orange;
        }
```

### 3.6、列表

```html
    <link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
<div id="nav">
    <h2 class="title">全部商品列表</h2>
    <ul>
        <li><a href="#">图书</a>&nbsp;&nbsp;<a href="#">音像</a>&nbsp;&nbsp;<a href="#">数字商品</a></li>
        <li><a href="#">家用电器</a>&nbsp;&nbsp;<a href="#">手机</a>&nbsp;&nbsp;<a href="#">数码</a></li>
        <li><a href="#">电脑</a>&nbsp;&nbsp;<a href="#">办公</a>
        <li><a href="#">家居</a>&nbsp;&nbsp;<a href="#">家装</a>&nbsp;&nbsp;<a href="#">厨具</a></li>
        <li><a href="#">服饰鞋帽</a>&nbsp;&nbsp;<a href="#">个护化妆</a>
        <li><a href="#">礼品箱包</a>&nbsp;&nbsp;<a href="#">钟表</a>&nbsp;&nbsp;<a href="#">珠宝</a></li>
        <li><a href="#">食品饮料</a>&nbsp;&nbsp;<a href="#">保健食品</a>
        <li><a href="#">彩票</a>&nbsp;&nbsp;<a href="#">旅行</a>&nbsp;&nbsp;<a href="#">充值</a>&nbsp;&nbsp;<a href="#">票务</a></li>
    </ul>
</div>
```

```css
a{
    text-decoration: none;
}
.title{
    font-size: 18px;
    font-weight: bold;
    text-indent: 4em;
    line-height: 30px;
    background: red;
}
/*ul li
list-style
        none 无圆
        circle 空心圆
        decimal 数字
        square 正方形

*/
/*ul{*/
/*    background: rgba(14, 4, 10, 0.66);*/
/*}*/
ul li{
    height: 30px;
    list-style: none;
    text-indent: 1em;
}
a{
    text-decoration: none;
    font-size: 14px;
    color: #000;
}
a:hover{
    color: orange;
    text-decoration: underline;
}
#nav{
    width: 300px;
    height: 300px;
    background: #a0a0a0;
}
```





















