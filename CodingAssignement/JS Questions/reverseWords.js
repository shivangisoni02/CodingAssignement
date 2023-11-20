function reverseWords(sentence) {
   
    let wordsArray = sentence.split(' ');
    let reversedWordsArray = wordsArray.map(word => reverseWord(word));
    let reversedSentence = reversedWordsArray.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}


let inputSentence = prompt("Enter a sentence:");


if (inputSentence !== null && inputSentence.trim() !== "") {
    let reversedSentence = reverseWords(inputSentence);
    console.log("Reversed Sentence:", reversedSentence);
} else {
    console.log("Invalid input. Please enter a non-empty sentence.");
}
