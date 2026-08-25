import {View, Text, Button, TextInput, StyleSheet} from "react-native"

const Calculator = () => {
    return (
        <View>
            <Text>Calculadora</Text>
            <View>
                <Text>Numéro 1: </Text>
                <TextInput />
            </View>
            <View>
                <Text>Numéro 2: </Text>
                <TextInput />
            </View>
            <View>
                <Button 
                    title="Calcular"
                    onPress={() => alert("Pressionou!")}
                />
            </View>
        </View>
    )
} 

export default Calculator