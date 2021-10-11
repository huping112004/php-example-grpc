<?php
    //引入 composer 的自动载加
    require __DIR__ . '/vendor/autoload.php';

    $client = new Helloworld\HelloworldClient('10.27.247.202:50051', [
        'credentials' => Grpc\ChannelCredentials::createInsecure(),
    ]);
    $request = new Helloworld\HelloRequest();
    $name="tayue";
    $request->setName($name);
     list($reply, $status) = $client->SayHello($request)->wait();
     //$message = $reply->getMessage();
    //print_r($message);

    $features  = $client->SayHi($request)->responses();
    foreach ($features as $feature) {
        echo "<pre>";
        print_r($feature->getMessage());
    }

//return $message;
//}
