## baseUrl:

```http
http://127.0.0.1:8080
```

## 接口

### 通过account查找

```http
item/findByAccount
```

Params: 

|   key   | value |  type  |
| :-----: | :---: | :----: |
| account |  123  | String |

ResponseBody:

```json
{
    "code": 0,
    "msg": "success",
    "data": [
        {
            "account": "123",
            "imageId": 123,
            "name": "123",
            "beiZhu": "123",
            "moneyCount": "123",
            "date": null,
            "type": "1",
            "out": true
        }
    ]
}
```

### 通过account和imageId查找

```http
item/findByAccountAndImageId
```

Params: 

|   key   | value |   type   |
| :-----: | :---: | :------: |
| account |  123  |  String  |
| imageId |  123  | Interger |

ResponseBody:

```json
{
    "code": 0,
    "msg": "success",
    "data": [
        {
            "account": "123",
            "imageId": 123,
            "name": "123",
            "beiZhu": "123",
            "moneyCount": "123",
            "date": null,
            "type": "1",
            "out": true
        }
    ]
}
```

### 添加数据

```http
item/add
```

RequestBody:

```json
{
    "account":"666",
    "imageId":666,
    "name":"666",
    "beiZhu":"666",
    "moneyCount":"666",
    "date": "2023-03-12T20:05:00",
    "type":"666",
    "isOUt":true
}
```

ResponseBody:


```json
{
    "code": 0,
    "msg": "success",
    "data": {
        "code": 0,
        "msg": "success"
    }
}
```

### 删除数据：

```http
item/delete
```

RequestBody:

```json
{
    "account":"666",
    "imageId":666,
    "name":"666",
    "beiZhu":"666",
    "moneyCount":"666",
    "date": "2023-03-12T20:05:00",
    "type":"666",
    "isOUt":true
}
```

ResponseBody:

```json
{
    "code": 0,
    "msg": "success",
    "data": {
        "code": 0,
        "msg": "success"
    }
}
```

