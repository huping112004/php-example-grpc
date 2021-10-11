<?php
namespace Helloworld;

/**
* service Xuexitest{}
* 编写 (gprc 定义 Xuexitest 服务)的客户端
*/
class HelloworldClient extends \Grpc\BaseStub
{

    public function __construct($hostname, $opts, $channel = null)
    {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * rpc SayTest(TestRequest) returns (TestReply) {}
     * 方法名尽量和 (gprc 定义 Xuexitest 服务)的方法一样
     * 用于请求和响应该服务
     */
    public function SayHello(\Helloworld\HelloRequest $argument,
                             $metadata = [], $options = [])
    {
        return $this->_simpleRequest('/helloworld.Greeter/SayHello',
            $argument,
            ['\Helloworld\HelloReply', 'decode'],
            $metadata, $options);
    }
    /**
     * server streaming
     * @param \Helloworld\HelloRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SayHi(\Helloworld\HelloRequest $argument,
                          $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/helloworld.Greeter/SayHi',
            $argument,
            ['\Helloworld\HelloReply', 'decode'],
            $metadata, $options);
    }
}