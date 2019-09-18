# netty-benchmark
主要用作单机测试netty性能测试
服务端打成jar包后执行脚本
nohup /opt/jdk1.8.0_144/bin/java -jar -server -Xmx4G -Xms4G -Xmn1G ./netty-server-benchmark.jar >server.out 2>&1 &

4核8g的主机跑10w并发完全没有问题，内存使用量大概在1.5g,cpu使用情况在150%

客户端打成jar包后执行脚本
/opt/jdk1.8.0_144/bin/java -jar netty-client-benchmark.jar 服务器IP

客户端的情况根据机器的性能来确定，默认设置的是单台15000个连接+心跳（windows主机），4核8g的，感觉会有点点卡

还增加了业务处理线程,每次停100ms，模拟业务场景
