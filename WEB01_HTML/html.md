# 1、前端



## 3、HTML

### 1.1、基本标签

h1 标题标签

p 段落标签

br换行

hr直线

meta

```
<meta charset="UTF-8">
<meta name="keywords" content="狂神说java">
```

&nbsp空格

```
&copy;  版权符号
```

em斜体

### 1.2、图像标签

```
<a href="4.连接标签.html#down">跳转</a>
```

```
<img src="../resource/img/1.jpg" alt="这是图片" title="这是一个图片可以显示" width="500" height="500">
```

```
<a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=&site=qq&menu=yes">   <img border="0" src="http://wpa.qq.com/pa?p=2::53" alt="联系我" title="联系我"/></a>
```

### 1.3、列表

有序列表

```
<ol title="有序列表">   
	<li>JavaEE</li>   
	<li>JavaSe</li>
</ol>
```

无序列表

```html
<ul title="无序列表">
				<li>CSS</li>
				<li>Html</li>
			</ul>
```



```
<form action="https://api.apiopen.top/getJoke" method="get">      <div>      page:<input type="text"><br>      count:<input type="text"><br>      type<input type="text">      <input type="submit">      <input type="reset" >   </div>
```

自定义列表

```html
<dl>
				<dt>列表title</dt>
				<dd>内容</dd>
			</dl>
```



表格

```html
<table border="2px">
		<tr>
			<td colspan="4">学生成绩</td>
		</tr>
		<tr>
			<td colspan="2" rowspan="2">张雪松</td>
			<td>语文</td>
			<td>100</td>
		</tr>
		<tr>
			<td>数学</td>
			<td>100</td>
		</tr>
		<tr>
			<td colspan="2" rowspan="2">张雪松</td>
			<td>语文</td>
			<td>100</td>
		</tr>
		<tr>
			<td>数学</td>
			<td>100</td>
		</tr>
		
	</table>
```

1.4、网页结构

```html
<header> <h2>网页头部</h2></header>
<section>
    <h2>网页主体</h2>
</section>
<footer>  <h2>网页脚部</h2></footer>
```

1.5、内嵌框架

```
<iframe src="https://www.baidu.com" frameborder="0" name="hello" width="1000px" height="1000px"></iframe>
```







1.6表单

单选框

```html
<p>性别:<input type="radio" value="boy" name="sex">男    <input type="radio" value="girl" name="sex">女</p>
```











