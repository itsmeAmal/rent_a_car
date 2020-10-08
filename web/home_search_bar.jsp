<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {
                font-family: Arial;
            }

            * {
                /*box-sizing: border-box;*/
            }

            form.example input[type=text] {
                padding: 10px;
                font-size: 17px;
                border: 0px solid grey;
                float: left;
                width: 80%;
                background: #f1f1f1;
            }

            form.example button {
                float: left;
                width: 20%;
                padding: 10px;
                background: #2196F3;
                color: white;
                font-size: 17px;
                border: 1px solid grey;
                border-left: none;
                cursor: pointer;
            }

            form.example button:hover {
                background: #0b7dda;
            }

            form.example::after {
                content: "";
                clear: both;
                display: table;
            }
        </style>
    </head>
    <body>
        <div style="position: absolute; top: 10%; width: 100%; height: 30%;">
            <form class="example" action="#" style="margin:auto;max-width:300px">
                <input type="text" placeholder="Search your vehicle.." name="search2">
                <button type="submit"><i class="fa fa-search"></i></button>
            </form> 
        </div>
    </body>
</html> 
