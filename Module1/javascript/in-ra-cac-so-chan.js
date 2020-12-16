function maxMinAvg(arr) {
    let arrnew = "";
    let max = arr[0];
    let min = arr[0];
    let sum = 0;
    let avg = 0;
    for (let i = 0; i <arr.length; i++){
        if( arr[i] > max){
            max = arr[i];
        }
    }arrnew.push(i);
    for (let i = 0; i <arr.length; i++){
        if (arr[i] < min){
            min = arr[i];

        }
    }arrnew.push(i);
    for (let i = 0; i <arr.length; i++){
        sum = sum + arr[i];
        avg = sum/arr.length;

    }arrenew.push(i);

    return arrnew;
}