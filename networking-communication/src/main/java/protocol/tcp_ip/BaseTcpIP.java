package protocol.tcp_ip;

// IP Address: 通过网络地址找到指定的host

// TODO: TCP协议本质上了保证数据传输的可靠性
// 1. 通过协议中定义的内容(SYN,ACK,FIN)来确保连接和数据发送成功
// 2. 位于OSI的第四层传输层，接收上层的数据，然后进行封装或者切割
// 3. 带有两个16 bits的端口号(Port Source, Port Des)，用于定位到指定的应用

// TCP协议的具体实现:
// 由OS操作系统来实现，不同OS的底层实现不同(汇编指令不同，硬件不同)
public class BaseTcpIP {

    // TCP位于7层网络协议中的传输层，负责数据的可靠性传输
    // Transmission Control Protocol, two-ways connection
    // reliable connection with the client/server model
    // 1. 通过三次握手来建立TCP连接
    //    1.1 client向server发送一个SYN
    //    1.2 server接收到之后，返回一个SYN ACK
    //    1.3 client接收到SYN ACK之后，再给server发送一个ACK
    //
    // 2. 通过4次挥手来断开TCP连接
    //    2.1 client向server发送FIN
    //    2.2 server接收到FIN之后，返回ACK(表示接收到了断开请求)，client端可以不发送数据，server可能还有数据正在处理)
    //    2.3 server端处理完之后，返回FIN(表示可以断开连接)
    //    2.4 client接收到ACK之后，再给server发送一个ACK
}
