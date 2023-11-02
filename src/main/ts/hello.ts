function init() {
    document.getElementById("reset")!.addEventListener("click", () => {
        // elementの型を特定する必要がある
        const element = document.getElementById("message")! as HTMLInputElement;
        // HTMLInputElementじゃないとvalueがない
        element.value = "Hello World!";
    });
}
