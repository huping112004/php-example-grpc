<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Helloworld;

/**
 * The greeting service definition.
 */
class GreeterClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Unary
     * @param \Helloworld\HelloRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SayHello(\Helloworld\HelloRequest $argument,
      $metadata = [], $options = []) {
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

    /**
     * client streaming
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function SayBala($metadata = [], $options = []) {
        return $this->_clientStreamRequest('/helloworld.Greeter/SayBala',
        ['\Helloworld\HelloReply','decode'],
        $metadata, $options);
    }

    /**
     * bidirectional streaming
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function Discuss($metadata = [], $options = []) {
        return $this->_bidiRequest('/helloworld.Greeter/Discuss',
        ['\Helloworld\HelloReply','decode'],
        $metadata, $options);
    }

}
