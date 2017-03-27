# PercentLayout
百分比布局
### Google支持百分比的方式布局，目的：可以通过百分比控制控件的大小
#### 准备工作
 添加相关依赖  :<br>
    compile 'com.android.support:appcompat-v7:25.3.0'<br>
    compile 'com.android.support:design:25.3.0'<br>
    compile 'com.zhy:percent-support-extends:1.0.1'<br>
    compile 'com.android.support:support-v4:25.3.0'<br>
#
## compile 'com.zhy:percent-support-extends:1.0.1'是 compile 'com.android.support:percent:22.2.0'的升级版<br>
### compile 'com.android.support:percent:22.2.0':<br>
* 提供PercentRelativeLayout、PercentFrameLayout，可自定义出PercentLinearLayout<br>
### compile 'com.zhy:percent-support-extends:1.0.1':<br>
* 提供PercentRelativeLayout、PercentFrameLayout、PercentLinearLayout<br>
* 支持百分比指定特定的参考值，比如宽度或者高度。<br>
例如：app:layout_heightPercent="50%w", app:layout_marginPercent="15%w", app:layout_marginBottomPercent="20%h".<br>
* 支持通过app:layout_textSizePercent设置textView的textSize<br>
* 可以在PercentLinearLayout的外层使用ScrollView<br>
>相关<br>
简单使用PercentRelativeLayout、PercentFrameLayout、PercentLinearLayout;其中涉及Material_Design中的AppBarTool，TabLayout，ViewPager,Fragment<br>
# 整体效果：
![img](https://github.com/ljrRookie/PercentLayout/blob/master/git/gif1.gif)<br>
![img](https://github.com/ljrRookie/PercentLayout/blob/master/git/GIF2.gif)<br>
