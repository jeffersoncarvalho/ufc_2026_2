import {View, Text, StyleSheet, Image} from "react-native"

//import GroupComponent from "./GroupComponent"

const StudentComponent = ({name, course, ira, imagesrc}) => {
    
    return (
        <View style={styles.card}>
           <Image source={{uri:imagesrc}} style={styles.image}/>
           
           <View style={styles.info}>
                <Text style={styles.name}>{name}</Text>
                <Text style={styles.course}>{course}</Text>
                <View style={styles.iraBox}>
                    <Text style={styles.label}>IRA</Text>
                    <Text style={styles.ira}>{ira}</Text>
                </View> 
           </View>
        </View>
    )
} //StudentComponent

const styles = StyleSheet.create(
    {
        card:{
            flexDirection: "row",
            alignItems: "center",
            padding: 16,
            margin: 16,
            backgroundColor: "#FFF",
            borderRadius: 14,
            
            shadowColor: "#000",
            shadowOffset: {width: 0, height: 2},
            shadowOpacity: 0.08,
            shadowRadius: 6,
            elevation: 5,
            
        },
        image: {
            width: 80,
            height: 80,
            borderRadius: 40,
            marginRight: 16,
            backgroundColor: "#E5E5EA"
        },
        info: {
            
        },
        name: {
            fontSize: 20,
            fontWeight: "bold",
            color: "1C1C1E"
        },
        course: {
            fontSize: 16,
            color: "#6E6E73",
            marginBottom: 8
        },
        iraBox: {
            flexDirection: "row",
        },
        label: {
            fontSize: 16,
            color: "#3A3A3C",
            marginRight: 6
        },
        ira: {
            fontSize: 18,
            fontWeight: "700",
            color: "#007AFF"
        }
    }
)

export default StudentComponent