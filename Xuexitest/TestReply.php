<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xuexitest.proto

namespace Xuexitest;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * <pre>
 *TestReply εεΊη»ζ
 * </pre>
 *
 * Protobuf type <code>xuexitest.TestReply</code>
 */
class TestReply extends \Google\Protobuf\Internal\Message
{
    /**
     * <code>repeated .xuexitest.TestReply.GetData getdataarr = 1;</code>
     */
    private $getdataarr;

    public function __construct() {
        \GPBMetadata\Xuexitest::initOnce();
        parent::__construct();
    }

    /**
     * <code>repeated .xuexitest.TestReply.GetData getdataarr = 1;</code>
     */
    public function getGetdataarr()
    {
        return $this->getdataarr;
    }

    /**
     * <code>repeated .xuexitest.TestReply.GetData getdataarr = 1;</code>
     */
    public function setGetdataarr(&$var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Xuexitest\TestReply_GetData::class);
        $this->getdataarr = $arr;
    }

}

