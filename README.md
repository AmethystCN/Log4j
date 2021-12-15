!只能将后缀为Jar的文件放进plugins文件夹内,如果安装，请一次性安装完全版后缀为Jar的文件,以免发送BUG!


*本项目采用开源项目https://github.com/jiongjionger/EastLandLog4jFixer 二次编辑！

文件内必要的插件是
PatchLog4j
前置插件
ProtocolLib
*注意EastLandLog4jFixer-master仅仅为原作者的源代码！

请勿将EastLandLog4jFixer-master放进plugins文件夹内




#About AmethystCN
#I am a very normal person!
And how did you find me when I hid it so deep? 

#Log4j
#Log4j detailed information of each server status:
#对于 1.18+ 的所有服务端（Vanilla，Spigot，Paper等）

#有校验，不好改，等修复（有兴趣的话可以前往服务端核心中的 META-INF/libraries.list 文件，修改 log4j 相关的三个 jar 路径及其 SHA256 签名，然后将新的 jar 导入 libraries 文件的指定目录）


#对于 1.18- 的 非 Paper(及其下游) 服务端

#使用压缩软件打开服务端核心和log4j-core，删除前者 org\apache\logging\log4j\core 文件夹，将后者同样路径中的 core 文件夹替换进去；然后删除org\apache\logging\log4j下的其他文件，将 log4j-api 中同名目录的所有文件替换进去即可


#对于 1.18- 的 Paper(及其下游) 服务端

#使用压缩软件打开 .\cache\patched_X.X.X.jar 和log4j-core，删除前者 org\apache\logging\log4j\core 文件夹，将后者同样路径中的 core 文件夹替换进去；然后删除org\apache\logging\log4j下的其他文件，将 log4j-api 中同名目录的所有文件替换进去；然后修改开服脚本，将服务端 jar 指向 .\cache\patched_X.X.X.jar 而非原来的 paperclip jar


#服务端核心修复跟踪


#Mohist 声明其 1.12.2,1.16.5 和 1.18.x 分支最新构建已修复此漏洞(1.12.2: https://github.com/MohistMC/Mohist/commit/cf2bdd4639cd75397011338450a317c2fedd2c13 , 1.16.5: https://github.com/MohistMC/Mohist/commit/24cc55acbf04708ecd39f948767f400577b24872 , 1.18.x: https://github.com/MohistMC/Mohist/commit/2a39eb2c009e5b66f3055756b018cc99bf978196)

#CatServer 声明其最新构建(21.12.10)已修复此漏洞(https://github.com/Luohuayu/CatServer/commit/9c1e882fb56ffd56fbb85429c09733dcd512ebec)

#LoliServer 声明其最新构建已修复此漏洞(https://github.com/Loli-Server/LoliServer1.16/commit/f5d646ea6f43ad2ba0760e73241f9a64f4bcf6c4)

#Paper 声明其 1.16.5(#792),1.17.1(#399) 和 1.18(#66) 分支最新构建已修复此漏洞(1.16.5:https://github.com/PaperMC/Paper/commit/cc25d64401ab49663d6b48411d2ac0707f5917b5 , 1.17.1:https://github.com/PaperMC/Paper/commit/244b392f390afa7a4880e2207c7358fe195bd431 , 1.18:https://github.com/PaperMC/Paper/commit/b475c6a683fa34156b964f751985f36a784ca0e0)

#Waterfall 声明其最新构建(#468)已修复此漏洞(https://github.com/PaperMC/Waterfall/commit/f45703fc46c8d8c35fab745181fce6f9f887be5d)

#Velocity 声明其最新构建(3.1.1 #98)已修复此漏洞

#Spigot 发布了一些超出计划的安全更新，以下版本的 Spigot 将得到修复:
#1.8.8 (BuildTools 版本 582-a)
#1.9.4 (BuildTools 版本 849-a)
#1.10.2 (BuildTools 版本 986-a)
#1.11.2 (BuildTools 版本 1251-a)
#1.12.2 (BuildTools 版本 1573-k)
#1.13.2 (BuildTools 版本 2148-d)
#1.14.4 (BuildTools 版本 2502-c)
#1.15.2 (BuildTools 版本 2703-a)
#1.16.5 (BuildTools 版本 3096-a)
#1.17.1 (BuildTools 版本 3284-a)
#1.18.1 (所有未来版本)
#(https://www.spigotmc.org/threads/security-releases-%E2%80%94-1-8-8%E2%80%931-18-1.537204/)

#Arclight 声明其 1.16 和 1.18 分支已修复此漏洞(1.16: https://github.com/IzzelAliz/Arclight/commit/6decf690fed7a851d00dab6ce457eae3ae3b5f62 , 1.18: https://github.com/IzzelAliz/Arclight/commit/1266a3af6dfe61042a73ee6e6b63e04c14dc0beb

#Forge 声明其多个版本已包含针对此次 log4j 漏洞的热更新，更多旧版本分支可能需要更多的工作以修复，推荐的版本:
#1.18-38.0.17
#1.17.1-37.1.1
#1.16.5-36.2.20
#1.15.2-31.2.56
#1.14.4-28.2.24
#1.13.2-25.0.221
#1.12.2-14.23.5.2856

#Fabric 建议使用 1.17 和 1.18 服务端的服主立即更新服务端的 Fabric Loader 为最新版本，或尽可能地更新至 Minecraft 1.18.1，如果不具备这些条件，则请遵照 Mojang 官方博文（见上）对漏洞进行修复

#更新
#12.10 10:45 log4j2 版本 2.15.0-rc1 对该漏洞的修复存在被绕过的可能，请更换至 log4j2 版本 2.15.0-rc2
#12.10 11:04 更新 Arclight 服务端漏洞修复跟踪
#12.10 19:50 更新 Forge 漏洞修复跟踪
#12.11 00:52 新增 “来自官方的漏洞修复建议”
#12.11 00:59 更新 Fabric 漏洞修复跟踪
