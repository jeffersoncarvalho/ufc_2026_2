import {View, Text, StyleSheet, Image} from "react-native"

import GroupComponent from "./GroupComponent"

const StudentComponent = ({name, course, ira, imagesrc}) => {
    
    return (
        <View style={styles.container}>
            <Text style={styles.title}>Informações do Estudante</Text>
            <GroupComponent label="Name" content={name}/>
            <GroupComponent label="Course" content={course}/>
            <GroupComponent label="IRA" content={ira}/>
            <View>
                <Image 
                    source={{uri: imagesrc}}
                    style={styles.image}
                />    
            </View>
        </View>
    )
} //StudentComponent

const styles = StyleSheet.create(
    {
        container: {
            //flex:1,
            //backgroundColor:"#c0c0c0",
        },
        title: {
            color:"orange",
            fontWeight:"bold",
            fontSize: 26,
        },
        image: {
            width:150,
            height:150
        }
        
    }
)

export default StudentComponent