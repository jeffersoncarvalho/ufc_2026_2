import {View, Text, StyleSheet} from "react-native"

import GroupComponent from "./GroupComponent"

const StudentComponent = ({name, course, ira}) => {
    
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Informações do Estudante</Text>
            <GroupComponent label="Name" content="Fulano de Tal"/>
            <GroupComponent label="Course" content="Sistemas de Informação"/>
            <GroupComponent label="IRA" content={5.6}/>
        </View>
    )
} //StudentComponent

const styles = StyleSheet.create(
    {
        container: {
            flex:1,
            //backgroundColor:"#c0c0c0",
            marginTop: 50,
        },
        title: {
            color:"orange",
            fontWeight:"bold",
            fontSize: 26,
            marginBottom: 20,
        },
        
    }
)

export default StudentComponent